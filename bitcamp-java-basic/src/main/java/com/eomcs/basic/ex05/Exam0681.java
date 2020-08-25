package com.eomcs.basic.ex05;

public class Exam0681 {
  public static void main(String[] args) {
    int a = 5;
    int r = --a + --a / --a;
    System.out.printf("%d, %d\n", a, r);
  }
}
