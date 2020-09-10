package com.gokalpkuscu.lambda.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MetricHandler implements RequestHandler<Object, Object> {

    @Override
    public String handleRequest(Object s, Context context) {
        return "just a test!";
    }
}
