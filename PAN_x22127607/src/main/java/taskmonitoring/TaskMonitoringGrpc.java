package taskmonitoring;

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
    comments = "Source: task_monitoring.proto")
public final class TaskMonitoringGrpc {

  private TaskMonitoringGrpc() {}

  public static final String SERVICE_NAME = "taskmonitoring.TaskMonitoring";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.TaskRequest,
      taskmonitoring.TaskMonitoringOuterClass.TaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTask",
      requestType = taskmonitoring.TaskMonitoringOuterClass.TaskRequest.class,
      responseType = taskmonitoring.TaskMonitoringOuterClass.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.TaskRequest,
      taskmonitoring.TaskMonitoringOuterClass.TaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.TaskRequest, taskmonitoring.TaskMonitoringOuterClass.TaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = TaskMonitoringGrpc.getCreateTaskMethod) == null) {
      synchronized (TaskMonitoringGrpc.class) {
        if ((getCreateTaskMethod = TaskMonitoringGrpc.getCreateTaskMethod) == null) {
          TaskMonitoringGrpc.getCreateTaskMethod = getCreateTaskMethod = 
              io.grpc.MethodDescriptor.<taskmonitoring.TaskMonitoringOuterClass.TaskRequest, taskmonitoring.TaskMonitoringOuterClass.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskmonitoring.TaskMonitoring", "createTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.TaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.TaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskMonitoringMethodDescriptorSupplier("createTask"))
                  .build();
          }
        }
     }
     return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.TaskRequest,
      taskmonitoring.TaskMonitoringOuterClass.TaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTask",
      requestType = taskmonitoring.TaskMonitoringOuterClass.TaskRequest.class,
      responseType = taskmonitoring.TaskMonitoringOuterClass.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.TaskRequest,
      taskmonitoring.TaskMonitoringOuterClass.TaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.TaskRequest, taskmonitoring.TaskMonitoringOuterClass.TaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = TaskMonitoringGrpc.getDeleteTaskMethod) == null) {
      synchronized (TaskMonitoringGrpc.class) {
        if ((getDeleteTaskMethod = TaskMonitoringGrpc.getDeleteTaskMethod) == null) {
          TaskMonitoringGrpc.getDeleteTaskMethod = getDeleteTaskMethod = 
              io.grpc.MethodDescriptor.<taskmonitoring.TaskMonitoringOuterClass.TaskRequest, taskmonitoring.TaskMonitoringOuterClass.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskmonitoring.TaskMonitoring", "deleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.TaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.TaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskMonitoringMethodDescriptorSupplier("deleteTask"))
                  .build();
          }
        }
     }
     return getDeleteTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest,
      taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse> getQueryTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryTasks",
      requestType = taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest.class,
      responseType = taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest,
      taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse> getQueryTasksMethod() {
    io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest, taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse> getQueryTasksMethod;
    if ((getQueryTasksMethod = TaskMonitoringGrpc.getQueryTasksMethod) == null) {
      synchronized (TaskMonitoringGrpc.class) {
        if ((getQueryTasksMethod = TaskMonitoringGrpc.getQueryTasksMethod) == null) {
          TaskMonitoringGrpc.getQueryTasksMethod = getQueryTasksMethod = 
              io.grpc.MethodDescriptor.<taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest, taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskmonitoring.TaskMonitoring", "queryTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskMonitoringMethodDescriptorSupplier("queryTasks"))
                  .build();
          }
        }
     }
     return getQueryTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest,
      taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse> getQueryProjectStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryProjectStatus",
      requestType = taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest.class,
      responseType = taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest,
      taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse> getQueryProjectStatusMethod() {
    io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest, taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse> getQueryProjectStatusMethod;
    if ((getQueryProjectStatusMethod = TaskMonitoringGrpc.getQueryProjectStatusMethod) == null) {
      synchronized (TaskMonitoringGrpc.class) {
        if ((getQueryProjectStatusMethod = TaskMonitoringGrpc.getQueryProjectStatusMethod) == null) {
          TaskMonitoringGrpc.getQueryProjectStatusMethod = getQueryProjectStatusMethod = 
              io.grpc.MethodDescriptor.<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest, taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskmonitoring.TaskMonitoring", "queryProjectStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskMonitoringMethodDescriptorSupplier("queryProjectStatus"))
                  .build();
          }
        }
     }
     return getQueryProjectStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest,
      taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse> getQueryExecutionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryExecutionHistory",
      requestType = taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest.class,
      responseType = taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest,
      taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse> getQueryExecutionHistoryMethod() {
    io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest, taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse> getQueryExecutionHistoryMethod;
    if ((getQueryExecutionHistoryMethod = TaskMonitoringGrpc.getQueryExecutionHistoryMethod) == null) {
      synchronized (TaskMonitoringGrpc.class) {
        if ((getQueryExecutionHistoryMethod = TaskMonitoringGrpc.getQueryExecutionHistoryMethod) == null) {
          TaskMonitoringGrpc.getQueryExecutionHistoryMethod = getQueryExecutionHistoryMethod = 
              io.grpc.MethodDescriptor.<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest, taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskmonitoring.TaskMonitoring", "queryExecutionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskMonitoringMethodDescriptorSupplier("queryExecutionHistory"))
                  .build();
          }
        }
     }
     return getQueryExecutionHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest,
      taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse> getRetryFailedTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "retryFailedTasks",
      requestType = taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest.class,
      responseType = taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest,
      taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse> getRetryFailedTasksMethod() {
    io.grpc.MethodDescriptor<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest, taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse> getRetryFailedTasksMethod;
    if ((getRetryFailedTasksMethod = TaskMonitoringGrpc.getRetryFailedTasksMethod) == null) {
      synchronized (TaskMonitoringGrpc.class) {
        if ((getRetryFailedTasksMethod = TaskMonitoringGrpc.getRetryFailedTasksMethod) == null) {
          TaskMonitoringGrpc.getRetryFailedTasksMethod = getRetryFailedTasksMethod = 
              io.grpc.MethodDescriptor.<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest, taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taskmonitoring.TaskMonitoring", "retryFailedTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskMonitoringMethodDescriptorSupplier("retryFailedTasks"))
                  .build();
          }
        }
     }
     return getRetryFailedTasksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskMonitoringStub newStub(io.grpc.Channel channel) {
    return new TaskMonitoringStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskMonitoringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskMonitoringBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskMonitoringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskMonitoringFutureStub(channel);
  }

  /**
   */
  public static abstract class TaskMonitoringImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTask(taskmonitoring.TaskMonitoringOuterClass.TaskRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.TaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    public void deleteTask(taskmonitoring.TaskMonitoringOuterClass.TaskRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.TaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    /**
     */
    public void queryTasks(taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryTasksMethod(), responseObserver);
    }

    /**
     */
    public void queryProjectStatus(taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryProjectStatusMethod(), responseObserver);
    }

    /**
     */
    public void queryExecutionHistory(taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryExecutionHistoryMethod(), responseObserver);
    }

    /**
     */
    public void retryFailedTasks(taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRetryFailedTasksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskmonitoring.TaskMonitoringOuterClass.TaskRequest,
                taskmonitoring.TaskMonitoringOuterClass.TaskResponse>(
                  this, METHODID_CREATE_TASK)))
          .addMethod(
            getDeleteTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskmonitoring.TaskMonitoringOuterClass.TaskRequest,
                taskmonitoring.TaskMonitoringOuterClass.TaskResponse>(
                  this, METHODID_DELETE_TASK)))
          .addMethod(
            getQueryTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest,
                taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse>(
                  this, METHODID_QUERY_TASKS)))
          .addMethod(
            getQueryProjectStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest,
                taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse>(
                  this, METHODID_QUERY_PROJECT_STATUS)))
          .addMethod(
            getQueryExecutionHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest,
                taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse>(
                  this, METHODID_QUERY_EXECUTION_HISTORY)))
          .addMethod(
            getRetryFailedTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest,
                taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse>(
                  this, METHODID_RETRY_FAILED_TASKS)))
          .build();
    }
  }

  /**
   */
  public static final class TaskMonitoringStub extends io.grpc.stub.AbstractStub<TaskMonitoringStub> {
    private TaskMonitoringStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskMonitoringStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskMonitoringStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskMonitoringStub(channel, callOptions);
    }

    /**
     */
    public void createTask(taskmonitoring.TaskMonitoringOuterClass.TaskRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.TaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTask(taskmonitoring.TaskMonitoringOuterClass.TaskRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.TaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTasks(taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryProjectStatus(taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryProjectStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExecutionHistory(taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryExecutionHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retryFailedTasks(taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest request,
        io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetryFailedTasksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskMonitoringBlockingStub extends io.grpc.stub.AbstractStub<TaskMonitoringBlockingStub> {
    private TaskMonitoringBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskMonitoringBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskMonitoringBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskMonitoringBlockingStub(channel, callOptions);
    }

    /**
     */
    public taskmonitoring.TaskMonitoringOuterClass.TaskResponse createTask(taskmonitoring.TaskMonitoringOuterClass.TaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public taskmonitoring.TaskMonitoringOuterClass.TaskResponse deleteTask(taskmonitoring.TaskMonitoringOuterClass.TaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse queryTasks(taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse queryProjectStatus(taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryProjectStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse queryExecutionHistory(taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryExecutionHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse retryFailedTasks(taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getRetryFailedTasksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskMonitoringFutureStub extends io.grpc.stub.AbstractStub<TaskMonitoringFutureStub> {
    private TaskMonitoringFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskMonitoringFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskMonitoringFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskMonitoringFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskmonitoring.TaskMonitoringOuterClass.TaskResponse> createTask(
        taskmonitoring.TaskMonitoringOuterClass.TaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskmonitoring.TaskMonitoringOuterClass.TaskResponse> deleteTask(
        taskmonitoring.TaskMonitoringOuterClass.TaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse> queryTasks(
        taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryTasksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse> queryProjectStatus(
        taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryProjectStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse> queryExecutionHistory(
        taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryExecutionHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse> retryFailedTasks(
        taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRetryFailedTasksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TASK = 0;
  private static final int METHODID_DELETE_TASK = 1;
  private static final int METHODID_QUERY_TASKS = 2;
  private static final int METHODID_QUERY_PROJECT_STATUS = 3;
  private static final int METHODID_QUERY_EXECUTION_HISTORY = 4;
  private static final int METHODID_RETRY_FAILED_TASKS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskMonitoringImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskMonitoringImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((taskmonitoring.TaskMonitoringOuterClass.TaskRequest) request,
              (io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.TaskResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((taskmonitoring.TaskMonitoringOuterClass.TaskRequest) request,
              (io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.TaskResponse>) responseObserver);
          break;
        case METHODID_QUERY_TASKS:
          serviceImpl.queryTasks((taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest) request,
              (io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse>) responseObserver);
          break;
        case METHODID_QUERY_PROJECT_STATUS:
          serviceImpl.queryProjectStatus((taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest) request,
              (io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXECUTION_HISTORY:
          serviceImpl.queryExecutionHistory((taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest) request,
              (io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse>) responseObserver);
          break;
        case METHODID_RETRY_FAILED_TASKS:
          serviceImpl.retryFailedTasks((taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest) request,
              (io.grpc.stub.StreamObserver<taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse>) responseObserver);
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

  private static abstract class TaskMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskMonitoringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return taskmonitoring.TaskMonitoringOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskMonitoring");
    }
  }

  private static final class TaskMonitoringFileDescriptorSupplier
      extends TaskMonitoringBaseDescriptorSupplier {
    TaskMonitoringFileDescriptorSupplier() {}
  }

  private static final class TaskMonitoringMethodDescriptorSupplier
      extends TaskMonitoringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskMonitoringMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaskMonitoringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskMonitoringFileDescriptorSupplier())
              .addMethod(getCreateTaskMethod())
              .addMethod(getDeleteTaskMethod())
              .addMethod(getQueryTasksMethod())
              .addMethod(getQueryProjectStatusMethod())
              .addMethod(getQueryExecutionHistoryMethod())
              .addMethod(getRetryFailedTasksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
