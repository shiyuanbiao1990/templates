package com.openfaas.model;

/**
 * @Auther: 石远彪
 * @Date: 2019/1/8 10:06
 * @Description:
 */
public interface IHandler {
    IResponse Handle(IRequest request);
}
