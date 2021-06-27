package org.fail.specialistjava1.lessons.lesson11;

public class Main {
	public static void main(String[] args) {
		Rect rect = new Rect(2, 3, -3, 2, "Rect1");
		Circle circle = new Circle(10, 2, -1, "Circle1");

		Shape[] shapes = {rect, circle, new Rect(1, 5, 2, 4, "Rect2")};

		printAreas(shapes);
	}

	private static void printAreas(Shape[] shapes) {
		for (Shape shape : shapes) {
			if (shape instanceof Rect) {
				Rect rect = (Rect) shape;
				rect.area();
			}
		}
	}
}
