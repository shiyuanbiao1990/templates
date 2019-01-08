package com.openfaas.model;

/**
 * @Auther: 石远彪
 * @Date: 2019/1/8 10:10
 * @Description:
 */
public class SampleHandler implements IHandler {
    @Override
    public IResponse Handle(IRequest request) {
        return new Response();
    }
}
