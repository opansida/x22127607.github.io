package taskmonitoring;

import io.grpc.stub.StreamObserver;
import taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryRequest;
import taskmonitoring.TaskMonitoringOuterClass.ExecutionHistoryResponse;
import taskmonitoring.TaskMonitoringOuterClass.ProjectStatusRequest;
import taskmonitoring.TaskMonitoringOuterClass.ProjectStatusResponse;
import taskmonitoring.TaskMonitoringOuterClass.QueryTasksRequest;
import taskmonitoring.TaskMonitoringOuterClass.QueryTasksResponse;
import taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksRequest;
import taskmonitoring.TaskMonitoringOuterClass.RetryFailedTasksResponse;
import taskmonitoring.TaskMonitoringOuterClass.TaskRequest;
import taskmonitoring.TaskMonitoringOuterClass.TaskResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TaskMonitoringImpl extends TaskMonitoringGrpc.TaskMonitoringImplBase {

    private final ConcurrentHashMap<String, TaskResponse> taskMap = new ConcurrentHashMap<>();

    @Override
    public void createTask(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // Create a new task with the given parameters
        TaskResponse task = TaskResponse.newBuilder()
                                        .setTaskId(request.getTaskId())
                                        .setTaskName(request.getTaskName())
                                        .setUserId(request.getUserId())
                                        .setStatus("Created")
                                        .build();

        // Add the task to the map
        taskMap.put(request.getTaskId(), task);

        // Send a response with the created task
        responseObserver.onNext(task);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteTask(TaskRequest request, StreamObserver<TaskResponse> responseObserver) {
        // Remove the task from the map
        TaskResponse task = taskMap.remove(request.getTaskId());

        if (task == null) {
            // If the task doesn't exist, send an error response
            responseObserver.onError(new RuntimeException("Task with ID " + request.getTaskId() + " not found."));
        } else {
            // Send a response with the deleted task
            task = task.toBuilder().setStatus("Deleted").build();
            responseObserver.onNext(task);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void queryTasks(QueryTasksRequest request, StreamObserver<QueryTasksResponse> responseObserver) {
        // Find all tasks for the given user ID
        List<TaskResponse> tasks = new ArrayList<>();
        for (TaskResponse task : taskMap.values()) {
            if (task.getUserId().equals(request.getUserId())) {
                tasks.add(task);
            }
        }

        // Send a response with the list of tasks
        QueryTasksResponse response = QueryTasksResponse.newBuilder().addAllTasks(tasks).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void queryProjectStatus(ProjectStatusRequest request, StreamObserver<ProjectStatusResponse> responseObserver) {
        // This method is not implemented
        responseObserver.onError(new RuntimeException("Method not implemented."));
    }

    @Override
    public void queryExecutionHistory(ExecutionHistoryRequest request, StreamObserver<ExecutionHistoryResponse> responseObserver) {
        // This method is not implemented
        responseObserver.onError(new RuntimeException("Method not implemented."));
    }

    public void retryFailedTasks(RetryFailedTasksRequest request, StreamObserver<RetryFailedTasksResponse> responseObserver) {
        // This method is not implemented
        responseObserver.onError(new RuntimeException("Method not implemented."));
    }
}
