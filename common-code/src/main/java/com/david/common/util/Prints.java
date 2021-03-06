package com.david.common.util;

import org.apache.logging.log4j.message.ParameterizedMessage;

/**
 * Created by jiakang on 2017/5/19.
 *
 * 打印。用于打印相关的封装，使用姿势如同log4j
 *  Prints.println("person info, name:{}, age:{}", "Davie", 23);
 * 输出：person info, name:David, age:13
 * @author jiakang
 */
public class Prints {

    public static void print(Object msg) {
        System.out.print(msg);
    }

    public static void print(String format, Object... params) {
        System.out.print(getFormattedMessage(format, params));
    }

    public static void println(Object msg) {
        System.out.println(msg);
    }

    public static void println(String format, Object... params) {
        String resultMsg = getFormattedMessage(format, params);
        System.out.println(resultMsg);
    }

    public static void printErr(Object msg) {
        System.err.print(msg);
    }

    public static void printErr(String format, Object... params) {
        System.err.print(getFormattedMessage(format, params));
    }

    public static void printlnErr(Object msg) {
        System.err.println(msg);
    }

    public static void printlnErr(String format, Object... params) {
        System.err.println(getFormattedMessage(format, params));
    }

    private static String getFormattedMessage(String format, Object[] params) {
        return new ParameterizedMessage(format, params).getFormattedMessage();
    }
}
