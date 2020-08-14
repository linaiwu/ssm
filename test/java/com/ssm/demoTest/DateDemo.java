package com.ssm.demoTest;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    @Test
    public void name() {
    }

    public DateDemo() {
    }

    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String s = simpleDateFormat.format(time);

        System.out.println(s);

    }
}
