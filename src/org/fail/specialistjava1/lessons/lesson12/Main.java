package org.fail.specialistjava1.lessons.lesson12;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Box[] boxes = {
				new Box(10, 1, 1),
				new Box(1, 10, 10),
				new Box(2, 2, 2)
		};

		Arrays.sort(boxes);

		for (Box box : boxes) {
			System.out.println(box.volume());
		}

		System.out.println("");
// 1) Variant
//		Box.CompareByA comparator = new Box(0, 0, 0).new CompareByA();
//		Arrays.sort(boxes, Comparator.comparingInt(Box::getA));

		// 3) Variant static local Class by Comparable
//		Arrays.sort(boxes, Box.compareByA());

		// 4) return Anonim Class by Comparable
//		Arrays.sort(boxes, Box.compareByA());

		// 5) Объявляем новый анонимный клас в аргументе
/*		Arrays.sort(boxes, new Comparator<Box>() {
			@Override
			public int compare(Box b1, Box b2) {
				return b1.getA() - b2.getA();
			}
		});*/

		Arrays.sort(boxes, (Box b1, Box b2) -> b1.getA() - b2.getA());
		for (Box box : boxes) {
			System.out.println(box.getA());
		}
	}
}