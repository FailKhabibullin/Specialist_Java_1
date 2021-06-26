package org.fail.specialistjava1.lessons.lesson10;

public class Test {
	private int x;

	public Test(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "Test: {" + "x=" + x + '}';
	}
}
