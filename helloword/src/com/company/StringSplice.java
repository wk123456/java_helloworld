package com.company;

public class StringSplice {
    //常量与常量拼接，生成的字符串在字符串常量池，原理是编译期优化
    public static void main(String[] args) {
        String s1 = "a" + "b";
        String s2 = "ab";
        System.out.println(s1 == s2);

    }


}
