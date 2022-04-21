package dto;


public class GetManagementAccessTokenDto {
    /**
     * 用户池密钥
     */
    private String secret
    /**
     * 用户池 ID
     */
    private String userPoolId

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

};