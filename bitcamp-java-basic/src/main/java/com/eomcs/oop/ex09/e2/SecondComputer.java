package com.eomcs.oop.ex09.e2;

public class SecondComputer implements Computer {
  @Override
  public void compute() {
    System.out.println("멀티태스킹 기능도 수행한다.");
  }

}
