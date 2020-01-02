package com.xiangmu.wyxw.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utils {
    public static boolean isnumber(String s){
        Pattern p = Pattern.compile("1\\d{10}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        return b;
    };
}
