package org.fail.specialistjava1.lessons.lesson9;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException {

    System.out.println("Total points: " + Point2D.getPointsCount());

    Point2D point1 = new Point2D();
    point1.setX(1);
    point1.setY(1);
    System.out.println(point1);

    Point2D point2 = new Point2D(2, 4);
    System.out.println(point2);

    Class.forName("org.fail.specialistjava1.lessons.lesson9.Block");
  }
}
