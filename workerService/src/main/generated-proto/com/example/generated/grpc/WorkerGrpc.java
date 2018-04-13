package com.example.generated.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: worker.proto")
public final class WorkerGrpc {

  private WorkerGrpc() {}

  public static final String SERVICE_NAME = "Worker";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.generated.grpc.WorkerOuterClass.Empty,
      com.example.generated.grpc.WorkerOuterClass.WorkersModel> METHOD_GET_WORKERS =
      io.grpc.MethodDescriptor.<com.example.generated.grpc.WorkerOuterClass.Empty, com.example.generated.grpc.WorkerOuterClass.WorkersModel>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Worker", "GetWorkers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.generated.grpc.WorkerOuterClass.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.generated.grpc.WorkerOuterClass.WorkersModel.getDefaultInstance()))
          .setSchemaDescriptor(new WorkerMethodDescriptorSupplier("GetWorkers"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest,
      com.example.generated.grpc.WorkerOuterClass.WorkerModel> METHOD_GET_WORKER =
      io.grpc.MethodDescriptor.<com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest, com.example.generated.grpc.WorkerOuterClass.WorkerModel>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Worker", "GetWorker"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.generated.grpc.WorkerOuterClass.WorkerModel.getDefaultInstance()))
          .setSchemaDescriptor(new WorkerMethodDescriptorSupplier("GetWorker"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.generated.grpc.WorkerOuterClass.WorkerModel,
      com.example.generated.grpc.WorkerOuterClass.WorkerModel> METHOD_POST_WORKER =
      io.grpc.MethodDescriptor.<com.example.generated.grpc.WorkerOuterClass.WorkerModel, com.example.generated.grpc.WorkerOuterClass.WorkerModel>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Worker", "PostWorker"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.generated.grpc.WorkerOuterClass.WorkerModel.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.generated.grpc.WorkerOuterClass.WorkerModel.getDefaultInstance()))
          .setSchemaDescriptor(new WorkerMethodDescriptorSupplier("PostWorker"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkerStub newStub(io.grpc.Channel channel) {
    return new WorkerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WorkerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WorkerFutureStub(channel);
  }

  /**
   */
  public static abstract class WorkerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWorkers(com.example.generated.grpc.WorkerOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkersModel> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_WORKERS, responseObserver);
    }

    /**
     */
    public void getWorker(com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest request,
        io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkerModel> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_WORKER, responseObserver);
    }

    /**
     */
    public void postWorker(com.example.generated.grpc.WorkerOuterClass.WorkerModel request,
        io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkerModel> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_POST_WORKER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_WORKERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.generated.grpc.WorkerOuterClass.Empty,
                com.example.generated.grpc.WorkerOuterClass.WorkersModel>(
                  this, METHODID_GET_WORKERS)))
          .addMethod(
            METHOD_GET_WORKER,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest,
                com.example.generated.grpc.WorkerOuterClass.WorkerModel>(
                  this, METHODID_GET_WORKER)))
          .addMethod(
            METHOD_POST_WORKER,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.generated.grpc.WorkerOuterClass.WorkerModel,
                com.example.generated.grpc.WorkerOuterClass.WorkerModel>(
                  this, METHODID_POST_WORKER)))
          .build();
    }
  }

  /**
   */
  public static final class WorkerStub extends io.grpc.stub.AbstractStub<WorkerStub> {
    private WorkerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerStub(channel, callOptions);
    }

    /**
     */
    public void getWorkers(com.example.generated.grpc.WorkerOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkersModel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_WORKERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWorker(com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest request,
        io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkerModel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_WORKER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postWorker(com.example.generated.grpc.WorkerOuterClass.WorkerModel request,
        io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkerModel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_POST_WORKER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WorkerBlockingStub extends io.grpc.stub.AbstractStub<WorkerBlockingStub> {
    private WorkerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.generated.grpc.WorkerOuterClass.WorkersModel getWorkers(com.example.generated.grpc.WorkerOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_WORKERS, getCallOptions(), request);
    }

    /**
     */
    public com.example.generated.grpc.WorkerOuterClass.WorkerModel getWorker(com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_WORKER, getCallOptions(), request);
    }

    /**
     */
    public com.example.generated.grpc.WorkerOuterClass.WorkerModel postWorker(com.example.generated.grpc.WorkerOuterClass.WorkerModel request) {
      return blockingUnaryCall(
          getChannel(), METHOD_POST_WORKER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WorkerFutureStub extends io.grpc.stub.AbstractStub<WorkerFutureStub> {
    private WorkerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.generated.grpc.WorkerOuterClass.WorkersModel> getWorkers(
        com.example.generated.grpc.WorkerOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_WORKERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.generated.grpc.WorkerOuterClass.WorkerModel> getWorker(
        com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_WORKER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.generated.grpc.WorkerOuterClass.WorkerModel> postWorker(
        com.example.generated.grpc.WorkerOuterClass.WorkerModel request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_POST_WORKER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WORKERS = 0;
  private static final int METHODID_GET_WORKER = 1;
  private static final int METHODID_POST_WORKER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WORKERS:
          serviceImpl.getWorkers((com.example.generated.grpc.WorkerOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkersModel>) responseObserver);
          break;
        case METHODID_GET_WORKER:
          serviceImpl.getWorker((com.example.generated.grpc.WorkerOuterClass.GetWorkerRequest) request,
              (io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkerModel>) responseObserver);
          break;
        case METHODID_POST_WORKER:
          serviceImpl.postWorker((com.example.generated.grpc.WorkerOuterClass.WorkerModel) request,
              (io.grpc.stub.StreamObserver<com.example.generated.grpc.WorkerOuterClass.WorkerModel>) responseObserver);
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

  private static abstract class WorkerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.generated.grpc.WorkerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Worker");
    }
  }

  private static final class WorkerFileDescriptorSupplier
      extends WorkerBaseDescriptorSupplier {
    WorkerFileDescriptorSupplier() {}
  }

  private static final class WorkerMethodDescriptorSupplier
      extends WorkerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkerMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkerFileDescriptorSupplier())
              .addMethod(METHOD_GET_WORKERS)
              .addMethod(METHOD_GET_WORKER)
              .addMethod(METHOD_POST_WORKER)
              .build();
        }
      }
    }
    return result;
  }
}
