package com.eomcs.oop.ex03;

public class Exam0840 {
  static class A {
    int b = 200;
    int c;
    
    public A() {
      // b = 200;
      // a = 100;
      c = 300;
    }
    
    int a = 100;
    }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b = %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }
}
