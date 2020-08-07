package com.eomcs.oop.ex03;

public class Exam0130_1 {
  static class A {
    static int v1;
    static boolean v2;
  }
  
  public static void main(String[] args) {
    A.v1 = 100;
    A.v2 = true;
    
    System.out.printf("%d, %b\n", A.v1, A.v2);
    
  }

}
