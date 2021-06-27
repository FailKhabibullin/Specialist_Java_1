package org.fail.specialistjava1.lessons.lesson11;

public abstract class Shape {
	private int x, y;
	private String name;

	public Shape(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public abstract double area();

	@Override
	public String toString() {
		return name + ": x=" + x + ", y=" + y;
	}
}
