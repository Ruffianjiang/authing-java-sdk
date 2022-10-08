package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateApplicationPermissionStrategyTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateApplicationPermissionStrategyDataDto request = new UpdateApplicationPermissionStrategyDataDto();
        request.setPermissionStrategy(cn.authing.sdk.java.dto.UpdateApplicationPermissionStrategyDataDto.PermissionStrategy.ALLOW_ALL);
        request.setAppId("appId_6342");

        IsSuccessRespDto response = client.updateApplicationPermissionStrategy(request);
        System.out.println(JsonUtils.serialize(response));
    }

}