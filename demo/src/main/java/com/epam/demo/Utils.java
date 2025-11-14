package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        List<String> list = args.stream().filter(x -> {
            return Integer.parseInt(x)>0;
        }).toList();
        return list.size() == args.size();
    }
}