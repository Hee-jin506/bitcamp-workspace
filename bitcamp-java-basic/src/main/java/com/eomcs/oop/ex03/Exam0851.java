package com.eomcs.oop.ex03;

public class Exam0851 {
  static class A {
    int b = 200;
    int c;
    
    A()  {
      // b = 200;
      // a = 100;
      // a = 111;
      // System.out.println("초기화 블록 실행");
      System.out.println("A()");
    }
    
    int a = 100;
    
    {
      a = 111;
      System.out.println("초기화 블록 실행");
    }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b = %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }
}
