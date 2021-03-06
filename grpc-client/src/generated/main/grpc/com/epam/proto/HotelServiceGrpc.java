package com.epam.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: hotel-serivce.proto")
public final class HotelServiceGrpc {

  private HotelServiceGrpc() {}

  public static final String SERVICE_NAME = "hotelservice.HotelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.epam.proto.HotelSerivce.UserProtobuf,
      com.epam.proto.HotelSerivce.RoomProtobuf> getGetRoomByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoomByUser",
      requestType = com.epam.proto.HotelSerivce.UserProtobuf.class,
      responseType = com.epam.proto.HotelSerivce.RoomProtobuf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.epam.proto.HotelSerivce.UserProtobuf,
      com.epam.proto.HotelSerivce.RoomProtobuf> getGetRoomByUserMethod() {
    io.grpc.MethodDescriptor<com.epam.proto.HotelSerivce.UserProtobuf, com.epam.proto.HotelSerivce.RoomProtobuf> getGetRoomByUserMethod;
    if ((getGetRoomByUserMethod = HotelServiceGrpc.getGetRoomByUserMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetRoomByUserMethod = HotelServiceGrpc.getGetRoomByUserMethod) == null) {
          HotelServiceGrpc.getGetRoomByUserMethod = getGetRoomByUserMethod = 
              io.grpc.MethodDescriptor.<com.epam.proto.HotelSerivce.UserProtobuf, com.epam.proto.HotelSerivce.RoomProtobuf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "hotelservice.HotelService", "GetRoomByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.HotelSerivce.UserProtobuf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.HotelSerivce.RoomProtobuf.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetRoomByUser"))
                  .build();
          }
        }
     }
     return getGetRoomByUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceStub newStub(io.grpc.Channel channel) {
    return new HotelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HotelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRoomByUser(com.epam.proto.HotelSerivce.UserProtobuf request,
        io.grpc.stub.StreamObserver<com.epam.proto.HotelSerivce.RoomProtobuf> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoomByUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRoomByUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.epam.proto.HotelSerivce.UserProtobuf,
                com.epam.proto.HotelSerivce.RoomProtobuf>(
                  this, METHODID_GET_ROOM_BY_USER)))
          .build();
    }
  }

  /**
   */
  public static final class HotelServiceStub extends io.grpc.stub.AbstractStub<HotelServiceStub> {
    private HotelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRoomByUser(com.epam.proto.HotelSerivce.UserProtobuf request,
        io.grpc.stub.StreamObserver<com.epam.proto.HotelSerivce.RoomProtobuf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoomByUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HotelServiceBlockingStub extends io.grpc.stub.AbstractStub<HotelServiceBlockingStub> {
    private HotelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.epam.proto.HotelSerivce.RoomProtobuf getRoomByUser(com.epam.proto.HotelSerivce.UserProtobuf request) {
      return blockingUnaryCall(
          getChannel(), getGetRoomByUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HotelServiceFutureStub extends io.grpc.stub.AbstractStub<HotelServiceFutureStub> {
    private HotelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.epam.proto.HotelSerivce.RoomProtobuf> getRoomByUser(
        com.epam.proto.HotelSerivce.UserProtobuf request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoomByUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROOM_BY_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROOM_BY_USER:
          serviceImpl.getRoomByUser((com.epam.proto.HotelSerivce.UserProtobuf) request,
              (io.grpc.stub.StreamObserver<com.epam.proto.HotelSerivce.RoomProtobuf>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.epam.proto.HotelSerivce.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelService");
    }
  }

  private static final class HotelServiceFileDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier {
    HotelServiceFileDescriptorSupplier() {}
  }

  private static final class HotelServiceMethodDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HotelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceFileDescriptorSupplier())
              .addMethod(getGetRoomByUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
