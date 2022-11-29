package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckRoleParamsDto {
    /**
     * 所属权限分组(权限空间)的 code
     */
    @JsonProperty("namespace")
    private String namespace;

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}