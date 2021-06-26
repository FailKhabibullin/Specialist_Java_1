package org.fail.specialistjava1.homeworks.labs.lab2.exercise1;

public class Main {
  public static void main(String[] args) {
    ComLineParser comLineParser = new ComLineParser(new String[] {"?", "r", "w"});
    comLineParser.parse(args);
  }
}
