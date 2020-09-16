package com.eomcs.oop.ex12;

public class Exam0320 {
  
  static interface Calculator {
    int compute(int a, int b);
  }
  
  static void test(Calculator c) {
    System.out.println(c.compute(100, 200));
  }
  
  public static void main(String[] args) {
    test((int a, int b) ->  a + b);
  }

}
