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
    comments = "Source: greeting-service.proto")
public final class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "GreetingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.class,
      responseType = com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getSayHelloMethod;
    if ((getSayHelloMethod = GreetingServiceGrpc.getSayHelloMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getSayHelloMethod = GreetingServiceGrpc.getSayHelloMethod) == null) {
          GreetingServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getLotsOfRepliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfReplies",
      requestType = com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.class,
      responseType = com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getLotsOfRepliesMethod() {
    io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getLotsOfRepliesMethod;
    if ((getLotsOfRepliesMethod = GreetingServiceGrpc.getLotsOfRepliesMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getLotsOfRepliesMethod = GreetingServiceGrpc.getLotsOfRepliesMethod) == null) {
          GreetingServiceGrpc.getLotsOfRepliesMethod = getLotsOfRepliesMethod = 
              io.grpc.MethodDescriptor.<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "LotsOfReplies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("LotsOfReplies"))
                  .build();
          }
        }
     }
     return getLotsOfRepliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getLotsOfGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfGreetings",
      requestType = com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.class,
      responseType = com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getLotsOfGreetingsMethod() {
    io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getLotsOfGreetingsMethod;
    if ((getLotsOfGreetingsMethod = GreetingServiceGrpc.getLotsOfGreetingsMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getLotsOfGreetingsMethod = GreetingServiceGrpc.getLotsOfGreetingsMethod) == null) {
          GreetingServiceGrpc.getLotsOfGreetingsMethod = getLotsOfGreetingsMethod = 
              io.grpc.MethodDescriptor.<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "LotsOfGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("LotsOfGreetings"))
                  .build();
          }
        }
     }
     return getLotsOfGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getBidiHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidiHello",
      requestType = com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.class,
      responseType = com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
      com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getBidiHelloMethod() {
    io.grpc.MethodDescriptor<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> getBidiHelloMethod;
    if ((getBidiHelloMethod = GreetingServiceGrpc.getBidiHelloMethod) == null) {
      synchronized (GreetingServiceGrpc.class) {
        if ((getBidiHelloMethod = GreetingServiceGrpc.getBidiHelloMethod) == null) {
          GreetingServiceGrpc.getBidiHelloMethod = getBidiHelloMethod = 
              io.grpc.MethodDescriptor.<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf, com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "GreetingService", "BidiHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf.getDefaultInstance()))
                  .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("BidiHello"))
                  .build();
          }
        }
     }
     return getBidiHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    return new GreetingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf request,
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void lotsOfReplies(com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf request,
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      asyncUnimplementedUnaryCall(getLotsOfRepliesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf> lotsOfGreetings(
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      return asyncUnimplementedStreamingCall(getLotsOfGreetingsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf> bidiHello(
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidiHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
                com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getLotsOfRepliesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
                com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>(
                  this, METHODID_LOTS_OF_REPLIES)))
          .addMethod(
            getLotsOfGreetingsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
                com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>(
                  this, METHODID_LOTS_OF_GREETINGS)))
          .addMethod(
            getBidiHelloMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf,
                com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>(
                  this, METHODID_BIDI_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingServiceStub extends io.grpc.stub.AbstractStub<GreetingServiceStub> {
    private GreetingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf request,
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lotsOfReplies(com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf request,
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLotsOfRepliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf> lotsOfGreetings(
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLotsOfGreetingsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf> bidiHello(
        io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidiHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetingServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf sayHello(com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> lotsOfReplies(
        com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf request) {
      return blockingServerStreamingCall(
          getChannel(), getLotsOfRepliesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingServiceFutureStub extends io.grpc.stub.AbstractStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf> sayHello(
        com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_LOTS_OF_REPLIES = 1;
  private static final int METHODID_LOTS_OF_GREETINGS = 2;
  private static final int METHODID_BIDI_HELLO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf) request,
              (io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>) responseObserver);
          break;
        case METHODID_LOTS_OF_REPLIES:
          serviceImpl.lotsOfReplies((com.epam.proto.GreetingServiceOuterClass.HelloRequestProtobuf) request,
              (io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>) responseObserver);
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
        case METHODID_LOTS_OF_GREETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.lotsOfGreetings(
              (io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>) responseObserver);
        case METHODID_BIDI_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiHello(
              (io.grpc.stub.StreamObserver<com.epam.proto.GreetingServiceOuterClass.HelloResponseProtobuf>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.epam.proto.GreetingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService");
    }
  }

  private static final class GreetingServiceFileDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier {
    GreetingServiceFileDescriptorSupplier() {}
  }

  private static final class GreetingServiceMethodDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getLotsOfRepliesMethod())
              .addMethod(getLotsOfGreetingsMethod())
              .addMethod(getBidiHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
