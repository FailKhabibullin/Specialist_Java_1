package org.fail.specialistjava1.lessons.lesson8;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.setX(4);

        System.out.println(test.getX());

        String str1 = "Hello";
        String str2 = "Hello";

        if (str1 == str2) {
            System.out.println("Ok");
        }
    }
}
