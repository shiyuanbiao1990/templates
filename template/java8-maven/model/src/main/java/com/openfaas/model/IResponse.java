package com.openfaas.model;

import java.util.Map;

/**
 * @Auther: 石远彪
 * @Date: 2019/1/8 10:07
 * @Description:
 */
public interface IResponse {
    String getBody();
    void setBody(String body);

    String getHeader(String key);
    void setHeader(String key, String value);
    Map<String, String> getHeaders();

    void setContentType(String contentType);
    String getContentType();

    void setStatusCode(int code);
    int getStatusCode();
}
