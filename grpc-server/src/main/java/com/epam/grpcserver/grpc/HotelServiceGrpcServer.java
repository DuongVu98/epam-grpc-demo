package com.epam.grpcserver.grpc;

import com.epam.proto.HotelSerivce;
import com.epam.proto.HotelServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j(topic = "[HotelServiceGrpcServer]")
public class HotelServiceGrpcServer extends HotelServiceGrpc.HotelServiceImplBase {
    @Override
    public void getRoomByUser(HotelSerivce.UserProtobuf request, StreamObserver<HotelSerivce.RoomProtobuf> responseObserver) {
        log.info("receive request with user: [{}]", request.getUserId());
        responseObserver.onNext(
           HotelSerivce.RoomProtobuf.newBuilder()
              .setRoomId("room1")
              .setRoomTypeId("type1")
              .build()
        );
        responseObserver.onCompleted();
    }
}
