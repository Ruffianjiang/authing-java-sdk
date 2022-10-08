package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserActionLogsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserActionLogsDto request = new GetUserActionLogsDto();
        request.setRequestId("requestId_4692");
        request.setClientIp("clientIp_4691");
        request.setEventType("eventType_7179");
        request.setUserId("userId_3007");
        request.setAppId("appId_5884");
        request.setStart(0);
        request.setEnd(0);
        request.setSuccess(Boolean.TRUE);
        request.setPagination(new cn.authing.sdk.java.dto.ListWebhooksDto());

        UserActionLogRespDto response = client.getUserActionLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}