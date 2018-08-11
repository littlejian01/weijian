package com.weijian.test;

import java.util.ArrayList;
import java.util.List;

public class Mian {

    public static final String NAME = "Liangweijian";

    public static void main(String[] args) {
        System.out.println("Hello, " + NAME);
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder().append("Hello World")
                .append("Hello java")
                .append("Hello java")
                .append("Hello java")
                .append("Hello java");
        System.out.println(sb.toString());
    }
}
