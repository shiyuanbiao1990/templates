package com.openfaas.model;

import java.util.Map;

/**
 * @Auther: 石远彪
 * @Date: 2019/1/8 10:07
 * @Description:
 */
public interface IRequest {
    String getBody();
    Map<String, String> getHeaders();
    String getHeader(String key);
    String getQueryRaw();
    Map<String, String> getQuery();
    String getPathRaw();
    Map<String, String> getPath();
}
