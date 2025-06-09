package com.hjg.entity;

import strings.StringFunctions;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author hjg
 * @Date 2025-06-09 20:25
 */
public class UseKotlinClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String result = StringFunctions.joinToString(list, ";", "(", ")");
        System.out.println(result);
    }
}
