package com.eomcs.oop.ex03;

public class Exam0830 {
  static class A {
    int a = 100;
    int b = 200;
    int c;
    
    public A() {
      c = 300;
    }
    
    public A(int a) {
      this.a = a;
      c = 300;
    }
    
    public A(int a, int b) {
      this.a = a;
      this.b = b;
      c = 300;
    }
  }

  public static void main(String[] args) {
    A obj = new A();
    System.out.printf("a=%d,b=%d,c=%d\n", obj.a, obj.b, obj.c);
    A obj1 = new A(111);
    System.out.printf("a=%d,b=%d,c=%d\n", obj1.a, obj1.b, obj1.c);
    A obj2 = new A(111, 222);
    System.out.printf("a=%d,b=%d,c=%d\n", obj2.a, obj2.b, obj2.c);

  }
}
