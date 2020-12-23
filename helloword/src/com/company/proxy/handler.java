package com.company.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class handler implements InvocationHandler {

    private Object target;

    public handler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("举手发言");
        method.invoke(target,args);
        System.out.println("坐下");

        return null;
    }
}
