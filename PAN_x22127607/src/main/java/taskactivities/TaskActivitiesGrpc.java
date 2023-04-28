package taskactivities;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: task_activities.proto")
public final class TaskActivitiesGrpc {

  private TaskActivitiesGrpc() {}

  public static final String SERVICE_NAME = "taskactivities.TaskActivities";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest,
      taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse> getSyncProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncProjects",
      requestType = taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest.class,
      responseType = taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest,
      taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse> getSyncProjectsMethod() {
    io.grpc.MethodDescriptor<taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest, taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse> getSyncProjectsMethod;
    if ((getSyncProjectsMethod = TaskActivitiesGrpc.getSyncProjectsMethod) == null) {
      synchronized (TaskActivitiesGrpc.class) {
        if ((getSyncProjectsMethod = TaskActivitiesGrpc.getSyncProjectsMethod) == null) {
          TaskActivitiesGrpc.getSyncProjectsMethod = getSyncProjectsMethod = 
              io.grpc.MethodDescriptor.<taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest, taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskactivities.TaskActivities", "syncProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskActivitiesMethodDescriptorSupplier("syncProjects"))
                  .build();
          }
        }
     }
     return getSyncProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest,
      taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse> getSubmitWorkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitWork",
      requestType = taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest.class,
      responseType = taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest,
      taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse> getSubmitWorkMethod() {
    io.grpc.MethodDescriptor<taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest, taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse> getSubmitWorkMethod;
    if ((getSubmitWorkMethod = TaskActivitiesGrpc.getSubmitWorkMethod) == null) {
      synchronized (TaskActivitiesGrpc.class) {
        if ((getSubmitWorkMethod = TaskActivitiesGrpc.getSubmitWorkMethod) == null) {
          TaskActivitiesGrpc.getSubmitWorkMethod = getSubmitWorkMethod = 
              io.grpc.MethodDescriptor.<taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest, taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskactivities.TaskActivities", "submitWork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskActivitiesMethodDescriptorSupplier("submitWork"))
                  .build();
          }
        }
     }
     return getSubmitWorkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskActivitiesStub newStub(io.grpc.Channel channel) {
    return new TaskActivitiesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskActivitiesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskActivitiesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskActivitiesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskActivitiesFutureStub(channel);
  }

  /**
   */
  public static abstract class TaskActivitiesImplBase implements io.grpc.BindableService {

    /**
     */
    public void syncProjects(taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest request,
        io.grpc.stub.StreamObserver<taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncProjectsMethod(), responseObserver);
    }

    /**
     */
    public void submitWork(taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest request,
        io.grpc.stub.StreamObserver<taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitWorkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSyncProjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest,
                taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse>(
                  this, METHODID_SYNC_PROJECTS)))
          .addMethod(
            getSubmitWorkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest,
                taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse>(
                  this, METHODID_SUBMIT_WORK)))
          .build();
    }
  }

  /**
   */
  public static final class TaskActivitiesStub extends io.grpc.stub.AbstractStub<TaskActivitiesStub> {
    private TaskActivitiesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskActivitiesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskActivitiesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskActivitiesStub(channel, callOptions);
    }

    /**
     */
    public void syncProjects(taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest request,
        io.grpc.stub.StreamObserver<taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitWork(taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest request,
        io.grpc.stub.StreamObserver<taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitWorkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskActivitiesBlockingStub extends io.grpc.stub.AbstractStub<TaskActivitiesBlockingStub> {
    private TaskActivitiesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskActivitiesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskActivitiesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskActivitiesBlockingStub(channel, callOptions);
    }

    /**
     */
    public taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse syncProjects(taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncProjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse submitWork(taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubmitWorkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskActivitiesFutureStub extends io.grpc.stub.AbstractStub<TaskActivitiesFutureStub> {
    private TaskActivitiesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskActivitiesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskActivitiesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskActivitiesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse> syncProjects(
        taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncProjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse> submitWork(
        taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitWorkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SYNC_PROJECTS = 0;
  private static final int METHODID_SUBMIT_WORK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskActivitiesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskActivitiesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SYNC_PROJECTS:
          serviceImpl.syncProjects((taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest) request,
              (io.grpc.stub.StreamObserver<taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_WORK:
          serviceImpl.submitWork((taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest) request,
              (io.grpc.stub.StreamObserver<taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse>) responseObserver);
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

  private static abstract class TaskActivitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskActivitiesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return taskactivities.TaskActivitiesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskActivities");
    }
  }

  private static final class TaskActivitiesFileDescriptorSupplier
      extends TaskActivitiesBaseDescriptorSupplier {
    TaskActivitiesFileDescriptorSupplier() {}
  }

  private static final class TaskActivitiesMethodDescriptorSupplier
      extends TaskActivitiesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskActivitiesMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaskActivitiesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskActivitiesFileDescriptorSupplier())
              .addMethod(getSyncProjectsMethod())
              .addMethod(getSubmitWorkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
