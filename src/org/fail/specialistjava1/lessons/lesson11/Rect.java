package org.fail.specialistjava1.lessons.lesson11;

public class Rect extends Shape {
	private int a, b;

	public Rect(int x, int y, int a, int b, String name) {
		super(x, y, name);
		this.a = a;
		this.b = b;
	}

	@Override
	public double area() {
		return a * b;
	}

	@Override
	public String toString() {
		return super.toString() + ", a=" + a + ", b=" + b;
	}
}
