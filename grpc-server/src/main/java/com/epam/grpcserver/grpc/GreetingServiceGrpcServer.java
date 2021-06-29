package com.epam.grpcserver.grpc;

import com.epam.proto.GreetingServiceGrpc;
import com.epam.proto.GreetingServiceOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j(topic = "[GreetingServiceGrpcServer]")
public class GreetingServiceGrpcServer extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void sayHello(GreetingServiceOuterClass.HelloRequestProtobuf request, StreamObserver<GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
        log.info("Received greeting: [{}]", request.getRequestMessage());
        responseObserver.onNext(GreetingServiceOuterClass.HelloResponseProtobuf.newBuilder().setResponseMessage("Hello client!").build());
        responseObserver.onCompleted();
    }

    @Override
    public void lotsOfReplies(GreetingServiceOuterClass.HelloRequestProtobuf request, StreamObserver<GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
        for (int i = 0; i<100;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            responseObserver.onNext(
               GreetingServiceOuterClass.HelloResponseProtobuf.newBuilder()
                  .setResponseMessage("Hello client!")
                  .setResponseNumber(i)
                  .build()
            );
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<GreetingServiceOuterClass.HelloRequestProtobuf> lotsOfGreetings(StreamObserver<GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
        return new StreamObserver<GreetingServiceOuterClass.HelloRequestProtobuf>() {
            private int sum = 0;

            @Override
            public void onNext(GreetingServiceOuterClass.HelloRequestProtobuf helloRequestProtobuf) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sum += helloRequestProtobuf.getRequestNumber();
                log.info("current sum: [{}]", sum);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<GreetingServiceOuterClass.HelloRequestProtobuf> bidiHello(StreamObserver<GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
        return new StreamObserver<GreetingServiceOuterClass.HelloRequestProtobuf>() {
            int sum = 0;
            int count = 0;

            @Override
            public void onNext(GreetingServiceOuterClass.HelloRequestProtobuf helloRequestProtobuf) {
                count += 1;
                sum += helloRequestProtobuf.getRequestNumber();
                if(count==10){
                    responseObserver.onNext(
                       GreetingServiceOuterClass.HelloResponseProtobuf.newBuilder()
                          .setResponseMessage("Hello client!")
                          .setResponseNumber(sum)
                          .build()
                    );
                    count = 0;
                    sum = 0;
                }
                log.info("current sum: [{}]", sum);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
