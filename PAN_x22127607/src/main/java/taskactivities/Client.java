package taskactivities;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest;
import taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse;
import taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest;
import taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Client {
    private final ManagedChannel channel;
    private final TaskActivitiesGrpc.TaskActivitiesBlockingStub blockingStub;

    public Client(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = TaskActivitiesGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void syncProjects(String... projectIds) {
        System.out.println("Sending syncProjects request with project IDs: " + Arrays.toString(projectIds));
        SyncProjectsRequest request = SyncProjectsRequest.newBuilder()
                .addAllProjectIds(Arrays.asList(projectIds))
                .build();
        SyncProjectsResponse response;
        try {
            response = blockingStub.syncProjects(request);
            System.out.println("Received syncProjects response with synced project IDs: " + response.getSyncedProjectIdsList());
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void submitWork(String projectId, String taskId, String userId) {
        System.out.println("Sending submitWork request with project ID: " + projectId + ", task ID: " + taskId + ", and user ID: " + userId);
        SubmitWorkRequest request = SubmitWorkRequest.newBuilder()
                .setProjectId(projectId)
                .setTaskId(taskId)
                .setUserId(userId)
                .build();
        SubmitWorkResponse response;
        try {
            response = blockingStub.submitWork(request);
            System.out.println("Received submitWork response with status: " + response.getStatus());
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Client client = new Client("localhost", 50051);
        try {
            client.syncProjects("project1", "project2");
            client.submitWork("project1", "task1", "user1");
        } finally {
            client.shutdown();
        }
    }
}
