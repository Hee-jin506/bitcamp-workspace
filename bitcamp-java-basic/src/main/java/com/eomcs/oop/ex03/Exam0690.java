package com.eomcs.oop.ex03;

public class Exam0690 {
  
  public static class A {
    static float pi;
    
    static float area(int r) {
      return pi * r * r;
    }
    
    static {
      pi = 3.14159f;
    }
  }
  
  public static void main(String[] args) {
    System.out.println(A.area(25));
  }

}
