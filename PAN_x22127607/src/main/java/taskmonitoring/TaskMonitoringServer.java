package taskmonitoring;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest;
import taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse;
import taskmonitoring.TaskMonitoringOuterClass.TaskRequest;
import taskmonitoring.TaskMonitoringOuterClass.TaskResponse;

import java.io.IOException;

public class TaskMonitoringServer extends TaskMonitoringGrpc.TaskMonitoringImplBase {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Start the server
        TaskMonitoringServer server = new TaskMonitoringServer();
        int port = 50051;
        Server grpcServer = ServerBuilder.forPort(port)
                .addService(server)
                .build()
                .start();
        System.out.println("Server started on port " + port);
        grpcServer.awaitTermination();
    }

    @Override
    public void createTask(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // Implementation of createTask
        TaskResponse response = TaskResponse.newBuilder()
                                            .setTaskId(request.getTaskId())
                                            .setTaskName(request.getTaskName())
                                            .setUserId(request.getUserId())
                                            .setStatus("Created")
                                            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteTask(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // Implementation of deleteTask
        TaskResponse response = TaskResponse.newBuilder()
                                            .setTaskId(request.getTaskId())
                                            .setTaskName(request.getTaskName())
                                            .setUserId(request.getUserId())
                                            .setStatus("Deleted")
                                            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void queryTasks(QueryTasksRequest request, StreamObserver<QueryTasksResponse> responseObserver) {
        // Implementation of queryTasks
        TaskResponse task1 = TaskResponse.newBuilder()
                                          .setTaskId("task1")
                                          .setTaskName("Task 1")
                                          .setUserId(request.getUserId())
                                          .setStatus("Pending")
                                          .build();
        TaskResponse task2 = TaskResponse.newBuilder()
                                          .setTaskId("task2")
                                          .setTaskName("Task 2")
                                          .setUserId(request.getUserId())
                                          .setStatus("Completed")
                                          .build();
        QueryTasksResponse response = QueryTasksResponse.newBuilder()
                                                        .addTasks(task1)
                                                        .addTasks(task2)
                                                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
