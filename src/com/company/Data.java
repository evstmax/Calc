package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class Data {

    public static String[] Parse(String text) {
        return text.split("(?=[+\\-/*]|(?<=[+\\-/*]))");
    }

    public static boolean isDigit(String[] s) {

        return tryParse(s[0]) > 0 && tryParse(s[0]) < 11
                && tryParse(s[2]) > 0 && tryParse(s[2]) < 11;
    }

    public static boolean isRoman(String[] s) {
        try {
            if (!Pattern.matches("I[XV]|V?I{0,3}", s[0])) {
                return true;
            }
            Pattern.matches("I[XV]|V?I{0,3}", s[2]);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static int tryParse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }


    public static int romanToInt(String s) throws Exception {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        if (!map.containsKey(s)) throw new Exception("Неверный формат ввода");
        return map.get(s);
    }

}
