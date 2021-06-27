package org.fail.specialistjava1.homeworks.labs.lab3;

public class Main {
	public static void main(String[] args) {
		SimpleParser simpleParser = new SimpleParser(new String[]{"w", "r"}, new String[]{"-", "/"});
		simpleParser.parse(args);

		System.out.println(simpleParser);
	}
}
