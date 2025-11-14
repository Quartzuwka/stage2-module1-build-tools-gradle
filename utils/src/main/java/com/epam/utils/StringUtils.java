package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str.isEmpty()){
            return false;
        }
        int parser = 0;
        if (Float.parseFloat(str) > 0) {
            return true;
        }
        return false;
    }
}
