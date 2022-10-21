package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateSyncTaskTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateSyncTaskDto request = new UpdateSyncTaskDto();
        request.setSyncTaskId(0);
        request.setSyncTaskName("syncTaskName_3831");
        request.setSyncTaskType(cn.authing.sdk.java.dto.UpdateSyncTaskDto.SyncTaskType.LARK);
        request.setClientConfig(new cn.authing.sdk.java.dto.SyncTaskClientConfig());
        request.setSyncTaskFlow(cn.authing.sdk.java.dto.UpdateSyncTaskDto.SyncTaskFlow.UPSTREAM);
        request.setSyncTaskTrigger(cn.authing.sdk.java.dto.UpdateSyncTaskDto.SyncTaskTrigger.MANUALLY);
        request.setOrganizationCode("organizationCode_7543");
        request.setProvisioningScope(new cn.authing.sdk.java.dto.SyncTaskProvisioningScope());
        request.setFieldMapping(Collections.singletonList(new cn.authing.sdk.java.dto.SyncTaskFieldMapping()));
        request.setTimedScheduler(new cn.authing.sdk.java.dto.SyncTaskTimedScheduler());

        SyncTaskPaginatedRespDto response = client.updateSyncTask(request);
        System.out.println(JsonUtils.serialize(response));
    }

}