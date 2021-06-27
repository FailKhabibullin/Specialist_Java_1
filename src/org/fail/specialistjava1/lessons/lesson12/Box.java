package org.fail.specialistjava1.lessons.lesson12;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Box implements Comparable<Box> {

	private int a, b, c;

	public Box(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int volume() {
		return a * b * c;
	}

	public int getA() {
		return a;
	}

	@Override
	public String toString() {
		return "Box{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
	}

	@Override
	public int compareTo(@NotNull Box box) {
		return volume() - box.volume();
	}

	/*
	1) Inner Class by Comparator
	 */
/*	public class CompareByA implements Comparator<Box> {
		@Override
		public int compare(Box b1, Box b2) {
			return b1.a - b2.a;
		}
	}*/

	/*
		2) Inner static Class by Comparator
	*/
/*	public static class CompareByA implements Comparator<Box> {
		@Override
		public int compare(Box b1, Box b2) {
			return b1.a - b2.a;
		}
	}*/

	/*
	 3) Local Class by Comparator
	 */
/*	public static Comparator<Box> compareByA() {
		class CMP implements Comparator<Box> {
			@Override
			public int compare(Box b1, Box b2) {
				return b2.a - b1.a;
			}
		}

		return new CMP();
	}*/

	/*
	4) Local Anonymous Class Comparable
	 */

	public static Comparator<Box> compareByA() {
		return new Comparator<Box>() {
			{
				int a;
			}

			@Override
			public int compare(Box b1, Box b2) {
				return b1.a - b2.a;
			}
		};
	}

}
