package com.openfaas.function;

import com.openfaas.model.IRequest;
import com.openfaas.model.IResponse;
import com.openfaas.model.Response;

public class Handler implements com.openfaas.model.IHandler {

    public IResponse Handle(IRequest req) {
        String result = System.getenv("MESSAGE");
        Response res = new Response();

	    res.setBody(result);

	    return res;
    }
}
