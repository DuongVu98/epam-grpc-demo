package com.epam.grpcclient;

import com.epam.proto.EventProducerGrpc;
import com.epam.proto.ExternalService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class GrpcClientApplication {

    @GrpcClient("local-grpc-server")
    private EventProducerGrpc.EventProducerBlockingStub localServer;

    @GrpcClient("cloud-grpc-server")
    private EventProducerGrpc.EventProducerBlockingStub cloudClient;

    @GrpcClient("golang-grpc-server")
    private EventProducerGrpc.EventProducerBlockingStub golangClient;

    public static void main(String[] args) {
        SpringApplication.run(GrpcClientApplication.class, args);
    }

    @GetMapping(value = "/local")
    public String sendUpdateRequest() {
        var command = ExternalService.UpdateCommand.newBuilder()
           .setUserId("user-1")
           .setInfo("user info")
           .build();
        var response = localServer.sendCommand(command);

        return response.getMessage();
    }

    @GetMapping(value = "/cloud")
    public String sendToCloudServer(){
        var command = ExternalService.UpdateCommand.newBuilder()
           .setUserId("user-1")
           .setInfo("user info")
           .build();
        var response = cloudClient.sendCommand(command);

        return response.getMessage();
    }

    @GetMapping(value = "/go")
    public String sendToGolangServer(){
        var command = ExternalService.UpdateCommand.newBuilder()
           .setUserId("user-1")
           .setInfo("user info")
           .build();
        var response = golangClient.sendCommand(command);

        return response.getMessage();
    }
}
