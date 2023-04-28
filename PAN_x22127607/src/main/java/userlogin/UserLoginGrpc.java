package userlogin;

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
    comments = "Source: user_login.proto")
public final class UserLoginGrpc {

  private UserLoginGrpc() {}

  public static final String SERVICE_NAME = "userlogin.UserLogin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetUserTasksRequest,
      userlogin.UserLoginOuterClass.GetUserTasksResponse> getGetUserTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserTasks",
      requestType = userlogin.UserLoginOuterClass.GetUserTasksRequest.class,
      responseType = userlogin.UserLoginOuterClass.GetUserTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetUserTasksRequest,
      userlogin.UserLoginOuterClass.GetUserTasksResponse> getGetUserTasksMethod() {
    io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetUserTasksRequest, userlogin.UserLoginOuterClass.GetUserTasksResponse> getGetUserTasksMethod;
    if ((getGetUserTasksMethod = UserLoginGrpc.getGetUserTasksMethod) == null) {
      synchronized (UserLoginGrpc.class) {
        if ((getGetUserTasksMethod = UserLoginGrpc.getGetUserTasksMethod) == null) {
          UserLoginGrpc.getGetUserTasksMethod = getGetUserTasksMethod = 
              io.grpc.MethodDescriptor.<userlogin.UserLoginOuterClass.GetUserTasksRequest, userlogin.UserLoginOuterClass.GetUserTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userlogin.UserLogin", "GetUserTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetUserTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetUserTasksResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserLoginMethodDescriptorSupplier("GetUserTasks"))
                  .build();
          }
        }
     }
     return getGetUserTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetExecutionHistoryRequest,
      userlogin.UserLoginOuterClass.GetExecutionHistoryResponse> getGetExecutionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExecutionHistory",
      requestType = userlogin.UserLoginOuterClass.GetExecutionHistoryRequest.class,
      responseType = userlogin.UserLoginOuterClass.GetExecutionHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetExecutionHistoryRequest,
      userlogin.UserLoginOuterClass.GetExecutionHistoryResponse> getGetExecutionHistoryMethod() {
    io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetExecutionHistoryRequest, userlogin.UserLoginOuterClass.GetExecutionHistoryResponse> getGetExecutionHistoryMethod;
    if ((getGetExecutionHistoryMethod = UserLoginGrpc.getGetExecutionHistoryMethod) == null) {
      synchronized (UserLoginGrpc.class) {
        if ((getGetExecutionHistoryMethod = UserLoginGrpc.getGetExecutionHistoryMethod) == null) {
          UserLoginGrpc.getGetExecutionHistoryMethod = getGetExecutionHistoryMethod = 
              io.grpc.MethodDescriptor.<userlogin.UserLoginOuterClass.GetExecutionHistoryRequest, userlogin.UserLoginOuterClass.GetExecutionHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userlogin.UserLogin", "GetExecutionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetExecutionHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetExecutionHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserLoginMethodDescriptorSupplier("GetExecutionHistory"))
                  .build();
          }
        }
     }
     return getGetExecutionHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetProjectsToRunRequest,
      userlogin.UserLoginOuterClass.GetProjectsToRunResponse> getGetProjectsToRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectsToRun",
      requestType = userlogin.UserLoginOuterClass.GetProjectsToRunRequest.class,
      responseType = userlogin.UserLoginOuterClass.GetProjectsToRunResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetProjectsToRunRequest,
      userlogin.UserLoginOuterClass.GetProjectsToRunResponse> getGetProjectsToRunMethod() {
    io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetProjectsToRunRequest, userlogin.UserLoginOuterClass.GetProjectsToRunResponse> getGetProjectsToRunMethod;
    if ((getGetProjectsToRunMethod = UserLoginGrpc.getGetProjectsToRunMethod) == null) {
      synchronized (UserLoginGrpc.class) {
        if ((getGetProjectsToRunMethod = UserLoginGrpc.getGetProjectsToRunMethod) == null) {
          UserLoginGrpc.getGetProjectsToRunMethod = getGetProjectsToRunMethod = 
              io.grpc.MethodDescriptor.<userlogin.UserLoginOuterClass.GetProjectsToRunRequest, userlogin.UserLoginOuterClass.GetProjectsToRunResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userlogin.UserLogin", "GetProjectsToRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetProjectsToRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetProjectsToRunResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserLoginMethodDescriptorSupplier("GetProjectsToRun"))
                  .build();
          }
        }
     }
     return getGetProjectsToRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.CreateAccountRequest,
      userlogin.UserLoginOuterClass.CreateAccountResponse> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccount",
      requestType = userlogin.UserLoginOuterClass.CreateAccountRequest.class,
      responseType = userlogin.UserLoginOuterClass.CreateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.CreateAccountRequest,
      userlogin.UserLoginOuterClass.CreateAccountResponse> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.CreateAccountRequest, userlogin.UserLoginOuterClass.CreateAccountResponse> getCreateAccountMethod;
    if ((getCreateAccountMethod = UserLoginGrpc.getCreateAccountMethod) == null) {
      synchronized (UserLoginGrpc.class) {
        if ((getCreateAccountMethod = UserLoginGrpc.getCreateAccountMethod) == null) {
          UserLoginGrpc.getCreateAccountMethod = getCreateAccountMethod = 
              io.grpc.MethodDescriptor.<userlogin.UserLoginOuterClass.CreateAccountRequest, userlogin.UserLoginOuterClass.CreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userlogin.UserLogin", "CreateAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.CreateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.CreateAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserLoginMethodDescriptorSupplier("CreateAccount"))
                  .build();
          }
        }
     }
     return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.DeleteAccountRequest,
      userlogin.UserLoginOuterClass.DeleteAccountResponse> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = userlogin.UserLoginOuterClass.DeleteAccountRequest.class,
      responseType = userlogin.UserLoginOuterClass.DeleteAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.DeleteAccountRequest,
      userlogin.UserLoginOuterClass.DeleteAccountResponse> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.DeleteAccountRequest, userlogin.UserLoginOuterClass.DeleteAccountResponse> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = UserLoginGrpc.getDeleteAccountMethod) == null) {
      synchronized (UserLoginGrpc.class) {
        if ((getDeleteAccountMethod = UserLoginGrpc.getDeleteAccountMethod) == null) {
          UserLoginGrpc.getDeleteAccountMethod = getDeleteAccountMethod = 
              io.grpc.MethodDescriptor.<userlogin.UserLoginOuterClass.DeleteAccountRequest, userlogin.UserLoginOuterClass.DeleteAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userlogin.UserLogin", "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.DeleteAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.DeleteAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserLoginMethodDescriptorSupplier("DeleteAccount"))
                  .build();
          }
        }
     }
     return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetAccountInfoRequest,
      userlogin.UserLoginOuterClass.GetAccountInfoResponse> getGetAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountInfo",
      requestType = userlogin.UserLoginOuterClass.GetAccountInfoRequest.class,
      responseType = userlogin.UserLoginOuterClass.GetAccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetAccountInfoRequest,
      userlogin.UserLoginOuterClass.GetAccountInfoResponse> getGetAccountInfoMethod() {
    io.grpc.MethodDescriptor<userlogin.UserLoginOuterClass.GetAccountInfoRequest, userlogin.UserLoginOuterClass.GetAccountInfoResponse> getGetAccountInfoMethod;
    if ((getGetAccountInfoMethod = UserLoginGrpc.getGetAccountInfoMethod) == null) {
      synchronized (UserLoginGrpc.class) {
        if ((getGetAccountInfoMethod = UserLoginGrpc.getGetAccountInfoMethod) == null) {
          UserLoginGrpc.getGetAccountInfoMethod = getGetAccountInfoMethod = 
              io.grpc.MethodDescriptor.<userlogin.UserLoginOuterClass.GetAccountInfoRequest, userlogin.UserLoginOuterClass.GetAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userlogin.UserLogin", "GetAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetAccountInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  userlogin.UserLoginOuterClass.GetAccountInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserLoginMethodDescriptorSupplier("GetAccountInfo"))
                  .build();
          }
        }
     }
     return getGetAccountInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserLoginStub newStub(io.grpc.Channel channel) {
    return new UserLoginStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserLoginBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserLoginBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserLoginFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserLoginFutureStub(channel);
  }

  /**
   */
  public static abstract class UserLoginImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserTasks(userlogin.UserLoginOuterClass.GetUserTasksRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetUserTasksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserTasksMethod(), responseObserver);
    }

    /**
     */
    public void getExecutionHistory(userlogin.UserLoginOuterClass.GetExecutionHistoryRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetExecutionHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExecutionHistoryMethod(), responseObserver);
    }

    /**
     */
    public void getProjectsToRun(userlogin.UserLoginOuterClass.GetProjectsToRunRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetProjectsToRunResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsToRunMethod(), responseObserver);
    }

    /**
     */
    public void createAccount(userlogin.UserLoginOuterClass.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.CreateAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void deleteAccount(userlogin.UserLoginOuterClass.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.DeleteAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     */
    public void getAccountInfo(userlogin.UserLoginOuterClass.GetAccountInfoRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetAccountInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                userlogin.UserLoginOuterClass.GetUserTasksRequest,
                userlogin.UserLoginOuterClass.GetUserTasksResponse>(
                  this, METHODID_GET_USER_TASKS)))
          .addMethod(
            getGetExecutionHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                userlogin.UserLoginOuterClass.GetExecutionHistoryRequest,
                userlogin.UserLoginOuterClass.GetExecutionHistoryResponse>(
                  this, METHODID_GET_EXECUTION_HISTORY)))
          .addMethod(
            getGetProjectsToRunMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                userlogin.UserLoginOuterClass.GetProjectsToRunRequest,
                userlogin.UserLoginOuterClass.GetProjectsToRunResponse>(
                  this, METHODID_GET_PROJECTS_TO_RUN)))
          .addMethod(
            getCreateAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                userlogin.UserLoginOuterClass.CreateAccountRequest,
                userlogin.UserLoginOuterClass.CreateAccountResponse>(
                  this, METHODID_CREATE_ACCOUNT)))
          .addMethod(
            getDeleteAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                userlogin.UserLoginOuterClass.DeleteAccountRequest,
                userlogin.UserLoginOuterClass.DeleteAccountResponse>(
                  this, METHODID_DELETE_ACCOUNT)))
          .addMethod(
            getGetAccountInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                userlogin.UserLoginOuterClass.GetAccountInfoRequest,
                userlogin.UserLoginOuterClass.GetAccountInfoResponse>(
                  this, METHODID_GET_ACCOUNT_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class UserLoginStub extends io.grpc.stub.AbstractStub<UserLoginStub> {
    private UserLoginStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLoginStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLoginStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLoginStub(channel, callOptions);
    }

    /**
     */
    public void getUserTasks(userlogin.UserLoginOuterClass.GetUserTasksRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetUserTasksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExecutionHistory(userlogin.UserLoginOuterClass.GetExecutionHistoryRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetExecutionHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExecutionHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsToRun(userlogin.UserLoginOuterClass.GetProjectsToRunRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetProjectsToRunResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectsToRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAccount(userlogin.UserLoginOuterClass.CreateAccountRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.CreateAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(userlogin.UserLoginOuterClass.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.DeleteAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountInfo(userlogin.UserLoginOuterClass.GetAccountInfoRequest request,
        io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetAccountInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserLoginBlockingStub extends io.grpc.stub.AbstractStub<UserLoginBlockingStub> {
    private UserLoginBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLoginBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLoginBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLoginBlockingStub(channel, callOptions);
    }

    /**
     */
    public userlogin.UserLoginOuterClass.GetUserTasksResponse getUserTasks(userlogin.UserLoginOuterClass.GetUserTasksRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public userlogin.UserLoginOuterClass.GetExecutionHistoryResponse getExecutionHistory(userlogin.UserLoginOuterClass.GetExecutionHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetExecutionHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public userlogin.UserLoginOuterClass.GetProjectsToRunResponse getProjectsToRun(userlogin.UserLoginOuterClass.GetProjectsToRunRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectsToRunMethod(), getCallOptions(), request);
    }

    /**
     */
    public userlogin.UserLoginOuterClass.CreateAccountResponse createAccount(userlogin.UserLoginOuterClass.CreateAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public userlogin.UserLoginOuterClass.DeleteAccountResponse deleteAccount(userlogin.UserLoginOuterClass.DeleteAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public userlogin.UserLoginOuterClass.GetAccountInfoResponse getAccountInfo(userlogin.UserLoginOuterClass.GetAccountInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserLoginFutureStub extends io.grpc.stub.AbstractStub<UserLoginFutureStub> {
    private UserLoginFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLoginFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLoginFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLoginFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userlogin.UserLoginOuterClass.GetUserTasksResponse> getUserTasks(
        userlogin.UserLoginOuterClass.GetUserTasksRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserTasksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userlogin.UserLoginOuterClass.GetExecutionHistoryResponse> getExecutionHistory(
        userlogin.UserLoginOuterClass.GetExecutionHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExecutionHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userlogin.UserLoginOuterClass.GetProjectsToRunResponse> getProjectsToRun(
        userlogin.UserLoginOuterClass.GetProjectsToRunRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectsToRunMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userlogin.UserLoginOuterClass.CreateAccountResponse> createAccount(
        userlogin.UserLoginOuterClass.CreateAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userlogin.UserLoginOuterClass.DeleteAccountResponse> deleteAccount(
        userlogin.UserLoginOuterClass.DeleteAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<userlogin.UserLoginOuterClass.GetAccountInfoResponse> getAccountInfo(
        userlogin.UserLoginOuterClass.GetAccountInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_TASKS = 0;
  private static final int METHODID_GET_EXECUTION_HISTORY = 1;
  private static final int METHODID_GET_PROJECTS_TO_RUN = 2;
  private static final int METHODID_CREATE_ACCOUNT = 3;
  private static final int METHODID_DELETE_ACCOUNT = 4;
  private static final int METHODID_GET_ACCOUNT_INFO = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserLoginImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserLoginImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_TASKS:
          serviceImpl.getUserTasks((userlogin.UserLoginOuterClass.GetUserTasksRequest) request,
              (io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetUserTasksResponse>) responseObserver);
          break;
        case METHODID_GET_EXECUTION_HISTORY:
          serviceImpl.getExecutionHistory((userlogin.UserLoginOuterClass.GetExecutionHistoryRequest) request,
              (io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetExecutionHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECTS_TO_RUN:
          serviceImpl.getProjectsToRun((userlogin.UserLoginOuterClass.GetProjectsToRunRequest) request,
              (io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetProjectsToRunResponse>) responseObserver);
          break;
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((userlogin.UserLoginOuterClass.CreateAccountRequest) request,
              (io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.CreateAccountResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((userlogin.UserLoginOuterClass.DeleteAccountRequest) request,
              (io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.DeleteAccountResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_INFO:
          serviceImpl.getAccountInfo((userlogin.UserLoginOuterClass.GetAccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<userlogin.UserLoginOuterClass.GetAccountInfoResponse>) responseObserver);
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

  private static abstract class UserLoginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserLoginBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return userlogin.UserLoginOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserLogin");
    }
  }

  private static final class UserLoginFileDescriptorSupplier
      extends UserLoginBaseDescriptorSupplier {
    UserLoginFileDescriptorSupplier() {}
  }

  private static final class UserLoginMethodDescriptorSupplier
      extends UserLoginBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserLoginMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserLoginGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserLoginFileDescriptorSupplier())
              .addMethod(getGetUserTasksMethod())
              .addMethod(getGetExecutionHistoryMethod())
              .addMethod(getGetProjectsToRunMethod())
              .addMethod(getCreateAccountMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getGetAccountInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
