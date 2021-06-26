package org.fail.specialistjava1.homeworks.labs.lab1.exercise2;

import java.util.HashMap;

public class Convertor {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July"};
//        boolean isLeapYear = isLeapYear();

        HashMap<Integer, Integer> tempYear = new HashMap<>();
        tempYear.put(1999, 91);
        tempYear.put(2000, 91);
        tempYear.put(1999, 186);
        tempYear.put(2000, 186);
        tempYear.put(1999, 304);
        tempYear.put(2000, 309);
        tempYear.put(2000, 309);
        tempYear.put(1999, 327);

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter year: ");
//        int userYearInput = scan.nextInt();
//
//        System.out.print("Enter days: ");
//        int userDaysInput = scan.nextInt();

        int monthNum = 0;
//
//        for (Map.Entry<Integer, Integer> integerIntegerEntry : tempYear.entrySet()) {
//            int days = 0;
//            if (isLeapYear(integerIntegerEntry.getValue()) && integerIntegerEntry.getValue() == 28) {
//                days = integerIntegerEntry.getValue() + 1;
//            }
//            if (days) {
//
//            }
//        }
//        for (int days : daysInMonth) {
//            if (isLeapYear(year) && days == 28) {
//                ++days;
//            }
//            if (dayNum <= days) {
//                break;
//            }
//            dayNum -= days;
//            monthNum++;
//        }

    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        }
        return false;
    }
}
