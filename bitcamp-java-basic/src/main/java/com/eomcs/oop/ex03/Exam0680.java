package com.eomcs.oop.ex03;

public class Exam0680 {
  
  public static class A {
    static int a = 100;
    
    static {
      a = 200;
      System.out.println("Static {} 실행");
    }
    
    static {
      b = 400;
    }
    
    static int b = 300;
    
  }

  
  public static void main(String[] args) {
    System.out.println(A.a);
    System.out.println(A.b);
  }
}
