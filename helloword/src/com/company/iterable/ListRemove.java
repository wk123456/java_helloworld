package com.company.iterable;

import java.util.ArrayList;

public class ListRemove {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("ss");
        strings.add("aa");
        strings.add("bb");
        strings.removeIf(u->u.equals("aa"));
        strings.forEach(u->{
            System.out.println(u);
        });
    }
}
