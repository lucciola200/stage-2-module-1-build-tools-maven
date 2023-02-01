package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!org.apache.commons.lang3.StringUtils.isNumeric(str)) {
            return false;
        }
        int number = Integer.parseInt(str);
        return number > 0 && number % 2 == 0;
    }
}
