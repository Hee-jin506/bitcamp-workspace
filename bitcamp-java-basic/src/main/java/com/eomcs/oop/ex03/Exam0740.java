package com.eomcs.oop.ex03;

public class Exam0740 {
  
  static class A {
    int a;
    int b;
    int c;
    
    {
      this.a = 101;
      System.out.println("첫번째");
    }
    
    {
      this.b = 102;
      System.out.println("두번째");
    }
    
    {
      this.a = 103;
      System.out.println("세번째");
    }
    
    A() {
      System.out.println("A()");
      b = 200;
      c = 300;
    }
  }
  
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b = %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }

}
