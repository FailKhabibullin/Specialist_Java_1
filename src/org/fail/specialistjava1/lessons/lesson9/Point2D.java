package org.fail.specialistjava1.lessons.lesson9;

import org.jetbrains.annotations.NotNull;

public class Point2D {
  private int x;
  private int y;
  private double length;
  private static int pointsCount;
  private final int pointID;

  public Point2D() {
    this(0, 0);
  }

  public Point2D(int x, int y) {
    this.setX(x);
    this.setY(y);
    this.pointID = pointsCount++;
  }

  private void calcVector() {
    length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }

  public double distanceTo(@NotNull Point2D point2D) {
    return Math.sqrt((x + point2D.x) * (x - point2D.x) + (y - point2D.y) * (y - point2D.y));
  }

  public int getX() {
    return x;
  }

  public final void setX(int x) {
    this.x = x;
    calcVector();
  }

  public int getY() {
    return y;
  }

  public final void setY(int y) {
    this.y = y;
    calcVector();
  }

  public double getLength() {
    return length;
  }

  public static int getPointsCount() {
    return pointsCount;
  }

  public int getPointID() {
    return pointID;
  }

  @Override
  public String toString() {

    String sb =
        this.getPointID()
            + ": "
            + ("(" + x + "," + " " + y + ")")
            + ", length = "
            + this.getLength();
    return sb;
  }
}
