package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateExtIdpConnTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateExtIdpConnDto request = new CreateExtIdpConnDto();
        request.setFields(Collections.emptyList());
        request.setDisplayName("displayName_7010");
        request.setIdentifier("identifier_1714");
        request.setType(cn.authing.sdk.java.dto.CreateExtIdpConnDto.Type.OIDC);
        request.setExtIdpId("extIdpId_3157");
        request.setLoginOnly(Boolean.TRUE);
        request.setLogo("logo_6693");

        ExtIdpConnDetailSingleRespDto response = client.createExtIdpConn(request);
        System.out.println(JsonUtils.serialize(response));
    }

}