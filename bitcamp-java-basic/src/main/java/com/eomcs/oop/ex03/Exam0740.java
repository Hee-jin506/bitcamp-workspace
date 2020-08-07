package com.eomcs.oop.ex03;

public class Exam0740 {
  static class A {
    int a;
    static int b;
    int c;
    
    
    {
      this.a = 101;
      System.out.println("첫번째 인스턴스 초기화 블록");
    }
    
    {
      this.a = 102;
      System.out.println("두 번째 인스턴스 초기화 블록");
    }
    
   A() {
     System.out.println("A()");
     b = 200;
     c = 300;
   }
  }
  public static void main(String[] args) {
    A obj = new A();
    System.out.printf("a = %d, b = %d, c= %d\n", obj.a, obj.b, obj.c);
  }
}
