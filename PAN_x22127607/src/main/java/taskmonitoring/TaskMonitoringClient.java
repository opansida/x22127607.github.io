package taskmonitoring;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest;
import taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse;
import taskmonitoring.TaskMonitoringOuterClass.TaskRequest;
import taskmonitoring.TaskMonitoringOuterClass.TaskResponse;

import java.util.concurrent.TimeUnit;

public class TaskMonitoringClient {

    private final ManagedChannel channel;
    private final TaskMonitoringGrpc.TaskMonitoringStub stub;

    public TaskMonitoringClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                                       .usePlaintext()
                                       .build();
        stub = TaskMonitoringGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void createTask(String taskId, String taskName, String userId) {
        TaskRequest request = TaskRequest.newBuilder()
                                         .setTaskId(taskId)
                                         .setTaskName(taskName)
                                         .setUserId(userId)
                                         .build();
        stub.createTask(request, new StreamObserver<TaskResponse>() {
            @Override
            public void onNext(TaskResponse response) {
                System.out.println("Task created with ID: " + response.getTaskId());
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error creating task: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Task creation completed.");
            }
        });
    }

    public void deleteTask(String taskId, String taskName, String userId) {
        TaskRequest request = TaskRequest.newBuilder()
                                         .setTaskId(taskId)
                                         .setTaskName(taskName)
                                         .setUserId(userId)
                                         .build();
        stub.deleteTask(request, new StreamObserver<TaskResponse>() {
            @Override
            public void onNext(TaskResponse response) {
                System.out.println("Task deleted with ID: " + response.getTaskId());
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error deleting task: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Task deletion completed.");
            }
        });
    }

    public void queryTasks(String userId) {
        QueryTasksRequest request = QueryTasksRequest.newBuilder()
                                                     .setUserId(userId)
                                                     .build();
        stub.queryTasks(request, new StreamObserver<QueryTasksResponse>() {
            @Override
            public void onNext(QueryTasksResponse response) {
                System.out.println("Tasks for user " + userId + ":");
                for (TaskResponse task : response.getTasksList()) {
                    System.out.println("- Task ID: " + task.getTaskId() + ", Name: " + task.getTaskName() + ", Status: " + task.getStatus());
                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error querying tasks: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Task query completed.");
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        String host = "localhost";
        int port = 50051;
        TaskMonitoringClient client = new TaskMonitoringClient(host, port);
        try {
            // Perform some gRPC calls
            client.createTask("task1", "Task 1", "user1");
            client.createTask("task2", "Task 2", "user2");
            client.deleteTask("task1", "Task 1", "user1");
            client.queryTasks("user2");
        } finally {
            // Shutdown the client
            client.shutdown();
        }
    }
}
