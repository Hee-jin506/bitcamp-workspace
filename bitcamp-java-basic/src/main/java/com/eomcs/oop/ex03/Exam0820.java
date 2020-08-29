package com.eomcs.oop.ex03;

public class Exam0820 {
  
  static class A {
    int a = 100;
    int b = 200;
    int c;
    
    public A() {
      a = 111;
      c = 333;
    }
  }
  
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b = %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }

}
