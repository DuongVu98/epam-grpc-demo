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

    @GrpcClient("")
    private EventProducerGrpc.EventProducerBlockingStub producerBlockingStub;

    public static void main(String[] args) {
        SpringApplication.run(GrpcClientApplication.class, args);
    }

    @GetMapping
    public String sendUpdateRequest() {
        var command = ExternalService.UpdateCommand.newBuilder()
           .setUserId("user-1")
           .setInfo("user info")
           .build();
        var response = producerBlockingStub.sendCommand(command);

        return response.getMessage();
    }
}
