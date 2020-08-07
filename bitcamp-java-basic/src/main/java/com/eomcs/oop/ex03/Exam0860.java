package com.eomcs.oop.ex03;

public class Exam0860 {
  static class A {
    int a = 100;
    
    {
      this.a = 200;
      System.out.println("초기화 블록");
    }
    
    A() {
      // a = 100;
      // a = 200;
      // System.out.println("초기화 블록");
      
      System.out.println("A()");
    }
    
    A(int a) {
      // a = 100;
      // a = 200;
      // System.out.println("A(int)");
      
      
      System.out.println("A(int)");
      this.a = a;
    }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println(obj1.a);
    
    System.out.println("-------------------");
    
    A obj2 = new A(1111);
    System.out.println(obj2.a);
  }
}
