package com.eomcs.oop.ex03;

public class Exam0850 {
  
  static class A {
    int b = 200;
    int c;
    
    A() {
      System.out.println("A()");
    }
    
    {
      a = 111;
      System.out.println("초기화 블록 실행");
    }
    
    int a = 100;
  }
  
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b= %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }

}
