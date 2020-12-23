package com.company;

import org.junit.Test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = new String("1");
        String s1 = s.intern();
        String s2 = "1";
        StringBuilder s6  = new StringBuilder();
        System.out.println(s1 == s2);

    }
    @Test
    public void test(){
        String s = "1";
        String s1 = new String("1");
        System.out.println(s == s1);
        String s3 = new String("2");
        String s2 = "2".intern();
        System.out.println(s2 == s3);
    }

}
