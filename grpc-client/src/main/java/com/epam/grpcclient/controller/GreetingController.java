package com.epam.grpcclient.controller;

import com.epam.proto.GreetingServiceGrpc;
import com.epam.proto.GreetingServiceOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
@Slf4j(topic = "[GreetingController]")
public class GreetingController {

    @GrpcClient("local-greeting-service")
    private GreetingServiceGrpc.GreetingServiceBlockingStub greetingServiceStub;

    @GrpcClient("local-greeting-service")
    private GreetingServiceGrpc.GreetingServiceStub stub;

    @GrpcClient("local-greeting-service")
    private GreetingServiceGrpc.GreetingServiceFutureStub futureStub;

    @GetMapping("/unary")
    public String sayHello() {
        var response = greetingServiceStub.sayHello(
           GreetingServiceOuterClass.HelloRequestProtobuf.newBuilder()
              .setRequestMessage("Hello there!")
              .setRequestNumber(0)
              .build()
        );
        return response.getResponseMessage();
    }

    @GetMapping("/server-stream")
    public void getResponseStream() {
        greetingServiceStub
           .lotsOfReplies(
              GreetingServiceOuterClass.HelloRequestProtobuf.newBuilder()
                 .setRequestMessage("Hello there!")
                 .setRequestNumber(0)
                 .build()
           )
           .forEachRemaining(response ->
              log.info("received response: [{}] with number [{}]", response.getResponseMessage(), response.getResponseNumber())
           );
    }

    @GetMapping("/client-stream")
    public void sendRequestStream() {
        var clientStream = stub.lotsOfGreetings(
           new StreamObserver<GreetingServiceOuterClass.HelloResponseProtobuf>() {
               @Override
               public void onNext(GreetingServiceOuterClass.HelloResponseProtobuf value) {

               }

               @Override
               public void onError(Throwable t) {

               }

               @Override
               public void onCompleted() {

               }
           }
        );

        for (int i = 0; i < 100; i++) {
            clientStream.onNext(
               GreetingServiceOuterClass.HelloRequestProtobuf.newBuilder()
                  .setRequestMessage("Hi server are you there?")
                  .setRequestNumber(i)
                  .build()
            );
        }

        clientStream.onCompleted();
    }

    @GetMapping("/bidi-stream")
    public void bidiGreeting(){
        var clientStream = stub.bidiHello(
           new StreamObserver<GreetingServiceOuterClass.HelloResponseProtobuf>() {
               @Override
               public void onNext(GreetingServiceOuterClass.HelloResponseProtobuf value) {
                    log.info("receive response: [{}] with next sum [{}]", value.getResponseMessage(), value.getResponseNumber());
               }

               @Override
               public void onError(Throwable t) {

               }

               @Override
               public void onCompleted() {

               }
           }
        );

        for (int i = 0; i < 100; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clientStream.onNext(
               GreetingServiceOuterClass.HelloRequestProtobuf.newBuilder()
                  .setRequestMessage("Hi server are you there?")
                  .setRequestNumber(i)
                  .build()
            );
        }

        clientStream.onCompleted();
    }
}
