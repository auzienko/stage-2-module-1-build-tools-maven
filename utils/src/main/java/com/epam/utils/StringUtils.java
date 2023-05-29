package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        try {
            return NumberUtils.createNumber(str).doubleValue() > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
