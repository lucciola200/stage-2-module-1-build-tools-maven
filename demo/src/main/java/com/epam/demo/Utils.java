package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       if (args == null) {
            return false;
        }
        for (String str : args) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false;
            }
        }
        return true;
    }
}