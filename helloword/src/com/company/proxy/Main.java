package com.company.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        handler handler = new handler(new Student());

        Person student = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, handler);
        student.say();
    }
}
