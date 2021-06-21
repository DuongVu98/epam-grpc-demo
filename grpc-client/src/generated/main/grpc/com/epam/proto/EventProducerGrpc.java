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
    comments = "Source: external-service.proto")
public final class EventProducerGrpc {

  private EventProducerGrpc() {}

  public static final String SERVICE_NAME = "EventProducer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.epam.proto.ExternalService.UpdateCommand,
      com.epam.proto.ExternalService.Response> getSendCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendCommand",
      requestType = com.epam.proto.ExternalService.UpdateCommand.class,
      responseType = com.epam.proto.ExternalService.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.epam.proto.ExternalService.UpdateCommand,
      com.epam.proto.ExternalService.Response> getSendCommandMethod() {
    io.grpc.MethodDescriptor<com.epam.proto.ExternalService.UpdateCommand, com.epam.proto.ExternalService.Response> getSendCommandMethod;
    if ((getSendCommandMethod = EventProducerGrpc.getSendCommandMethod) == null) {
      synchronized (EventProducerGrpc.class) {
        if ((getSendCommandMethod = EventProducerGrpc.getSendCommandMethod) == null) {
          EventProducerGrpc.getSendCommandMethod = getSendCommandMethod = 
              io.grpc.MethodDescriptor.<com.epam.proto.ExternalService.UpdateCommand, com.epam.proto.ExternalService.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EventProducer", "SendCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.ExternalService.UpdateCommand.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.ExternalService.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EventProducerMethodDescriptorSupplier("SendCommand"))
                  .build();
          }
        }
     }
     return getSendCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventProducerStub newStub(io.grpc.Channel channel) {
    return new EventProducerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventProducerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventProducerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventProducerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventProducerFutureStub(channel);
  }

  /**
   */
  public static abstract class EventProducerImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendCommand(com.epam.proto.ExternalService.UpdateCommand request,
        io.grpc.stub.StreamObserver<com.epam.proto.ExternalService.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendCommandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendCommandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.epam.proto.ExternalService.UpdateCommand,
                com.epam.proto.ExternalService.Response>(
                  this, METHODID_SEND_COMMAND)))
          .build();
    }
  }

  /**
   */
  public static final class EventProducerStub extends io.grpc.stub.AbstractStub<EventProducerStub> {
    private EventProducerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventProducerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventProducerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventProducerStub(channel, callOptions);
    }

    /**
     */
    public void sendCommand(com.epam.proto.ExternalService.UpdateCommand request,
        io.grpc.stub.StreamObserver<com.epam.proto.ExternalService.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventProducerBlockingStub extends io.grpc.stub.AbstractStub<EventProducerBlockingStub> {
    private EventProducerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventProducerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventProducerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventProducerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.epam.proto.ExternalService.Response sendCommand(com.epam.proto.ExternalService.UpdateCommand request) {
      return blockingUnaryCall(
          getChannel(), getSendCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventProducerFutureStub extends io.grpc.stub.AbstractStub<EventProducerFutureStub> {
    private EventProducerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventProducerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventProducerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventProducerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.epam.proto.ExternalService.Response> sendCommand(
        com.epam.proto.ExternalService.UpdateCommand request) {
      return futureUnaryCall(
          getChannel().newCall(getSendCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_COMMAND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventProducerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventProducerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_COMMAND:
          serviceImpl.sendCommand((com.epam.proto.ExternalService.UpdateCommand) request,
              (io.grpc.stub.StreamObserver<com.epam.proto.ExternalService.Response>) responseObserver);
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

  private static abstract class EventProducerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventProducerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.epam.proto.ExternalService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventProducer");
    }
  }

  private static final class EventProducerFileDescriptorSupplier
      extends EventProducerBaseDescriptorSupplier {
    EventProducerFileDescriptorSupplier() {}
  }

  private static final class EventProducerMethodDescriptorSupplier
      extends EventProducerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventProducerMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventProducerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventProducerFileDescriptorSupplier())
              .addMethod(getSendCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
