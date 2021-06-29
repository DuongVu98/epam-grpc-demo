package com.epam.grpcclient.controller;

import com.epam.proto.HotelSerivce;
import com.epam.proto.HotelServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hotel")
@Slf4j(topic = "[HotelServiceClientController]")
public class HotelServiceClientController {

    @GrpcClient("local-spring-server")
    private HotelServiceGrpc.HotelServiceBlockingStub hotelServiceBlockingStub;

    @GetMapping(value = "/room")
    public String getRoomByUser() {
        var response = hotelServiceBlockingStub.getRoomByUser(
           HotelSerivce.UserProtobuf.newBuilder()
              .setUserId("user1")
              .setHotelId("hotel1")
              .build()
        );

        log.info("receive response: [{}]", response);
        return response.getRoomId();
    }
}
