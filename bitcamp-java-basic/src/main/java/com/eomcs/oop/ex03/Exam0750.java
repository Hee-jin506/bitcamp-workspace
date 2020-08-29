package com.eomcs.oop.ex03;

public class Exam0750 {
  
  static class A {
    int a;
    int b;
    int c;
    
    {
      this.a = 101;
      System.out.println("첫번째");
    }
    
    A() {
      System.out.println("A()");
      b = 200;
      c = 300;
    }
    
    {
      this.a = 102;
      System.out.println("두번째");
    }
    
    {
      this.a = 103;
      System.out.println("세번째");
    }
  }

}
