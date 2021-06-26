package org.fail.specialistjava1.lessons.lesson9;

public class Block {

  static {
    System.out.println("Static block");
  }

  {
    System.out.println("Block");
  }

  public Block() {
    System.out.println("Constructor");
  }
}
