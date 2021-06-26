package org.fail.specialistjava1.lessons.lesson10;

public class TestPair extends Test {
	private int y;

	public TestPair(int x, int y) {
		super(x);
		this.y = y;
	}

	@Override
	public String toString() {
		return super.toString() + ", y=" + y;
	}
}
