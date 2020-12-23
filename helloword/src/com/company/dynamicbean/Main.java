package com.company.dynamicbean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
//cglib2.2 asm3.3
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("wang");
        student.setAge(18);
        try {
            HashMap addMap = new HashMap();
            HashMap addValMap = new HashMap();
            addMap.put("des", Class.forName("java.lang.String"));
            addValMap.put("des", "动态增加属性");
            Object obj2 = new ClassUtil().dynamicClass(student, addMap, addValMap);
            JSONObject jsonObject = (JSONObject) JSONObject.parse(JSON.toJSONString(obj2));
            System.out.println(JSON.toJSONString(obj2));
            System.out.println("dsffdf");
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}
