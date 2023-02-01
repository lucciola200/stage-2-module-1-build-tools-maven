package com.epam.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        int isAll = 0;
        List<Integer> integerArgs = args.stream().map(Integer::parseInt).collect(Collectors.toList());
        for(int i: integerArgs) {
            if (i % 2 != 0) {
                isAll += 1;
            }
        }
        return isAll == 0;
    }
}