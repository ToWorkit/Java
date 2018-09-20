package com.objectP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_01 {
    public static void main(String[] args) {

        // 获取当前日期时间
        Date date = new Date();
        System.out.println(date);

        // 转为 yyyy-MM-dd HH:MM:SS
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = simpleDateFormat.format(date);
        System.out.println(str);
    }
}
