package com.platzi.JavaTests.util;

public class DateUtil {
//    Nueva linea de codigo, para prueba de Commit directo de InteligentIDEA
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
