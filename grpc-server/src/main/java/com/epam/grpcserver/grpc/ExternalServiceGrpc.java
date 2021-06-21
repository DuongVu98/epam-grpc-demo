package com.epam.grpcserver.grpc;

import com.epam.proto.EventProducerGrpc;
import com.epam.proto.ExternalService;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j(topic = "[ExternalServiceGrpc]")
public class ExternalServiceGrpc extends EventProducerGrpc.EventProducerImplBase {
    @Override
    public void sendCommand(ExternalService.UpdateCommand request, StreamObserver<ExternalService.Response> responseObserver) {
        log.info("Execute update command {}", request.getUserId());
        var response = ExternalService.Response.newBuilder()
           .setMessage("updated")
           .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
