package com.eomcs.oop.ex12;

public class Exam0331 {

  static interface Calculator {
    int compute(int a, int b);
  }
  
  static void test(Calculator c) {
    System.out.println(c.compute(100, 200));
  }
  
  public static void main(String[] args) {
    
    test((a, b) -> a + b);
    
    test((a, b) -> {
      int sum = 0;
      for (int i = a; i <= b; i++)
        sum += i;
      return sum;
    });
  }
}
