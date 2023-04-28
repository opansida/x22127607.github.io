package taskactivities;

import io.grpc.stub.StreamObserver;
import taskactivities.TaskActivitiesOuterClass.SubmitWorkRequest;
import taskactivities.TaskActivitiesOuterClass.SubmitWorkResponse;
import taskactivities.TaskActivitiesOuterClass.SyncProjectsRequest;
import taskactivities.TaskActivitiesOuterClass.SyncProjectsResponse;

public class TaskActivitiesImpl extends TaskActivitiesGrpc.TaskActivitiesImplBase {
    @Override
    public void syncProjects(SyncProjectsRequest request, StreamObserver<SyncProjectsResponse> responseObserver) {
        // Implement the syncProjects RPC method here.
        SyncProjectsResponse response = SyncProjectsResponse.newBuilder()
                .addAllSyncedProjectIds(request.getProjectIdsList())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void submitWork(SubmitWorkRequest request, StreamObserver<SubmitWorkResponse> responseObserver) {
        // Implement the submitWork RPC method here.
        SubmitWorkResponse response = SubmitWorkResponse.newBuilder()
                .setProjectId(request.getProjectId())
                .setTaskId(request.getTaskId())
                .setUserId(request.getUserId())
                .setStatus("Submitted")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
