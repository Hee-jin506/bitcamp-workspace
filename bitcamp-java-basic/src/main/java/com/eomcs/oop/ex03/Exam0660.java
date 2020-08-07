package com.eomcs.oop.ex03;

public class Exam0660 {
  public static class A {
    static int a;
    static void m() {}
    
    static {
      System.out.println("Static{] 11111");
    }
    
    static {
      System.out.println("Static{} 22222");
    }
  }

  public static void main(String[] args) {
    A.a = 100;
    A.m();
    new A();
    // Class.forName("com.eomcs.oop.ex03.Exam0660$A");
    System.out.println("------");
    new A();
  }
}
