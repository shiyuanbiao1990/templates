package com.openfaas.function;

import com.openfaas.model.IHandler;
import com.openfaas.model.IRequest;
import com.openfaas.model.IResponse;
import com.openfaas.model.Response;

/**
 * @Auther: 石远彪
 * @Date: 2019/1/8 10:12
 * @Description:
 */
public class Handler implements IHandler {

    public IResponse Handle(IRequest req) {
        Response res = new Response();
        res.setBody("Hello, this is syb from maven!");

        return res;
    }
}
