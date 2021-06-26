package org.fail.specialistjava1.lessons.lesson11;

public class Rect extends Shape {
	private int a, b;

	public Rect(int x, int y, String name, int a, int b) {
		super(x, y, name);
		this.a = a;
		this.b = b;
	}
}