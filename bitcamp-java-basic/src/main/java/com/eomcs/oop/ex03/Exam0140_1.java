package com.eomcs.oop.ex03;

public class Exam0140_1 {
  static class A {
    static int v1;
    int v2;
  }
  
  public static void main(String[] args) {
    A.v1 = 100;
    // A.v2 = 200;
    
    A p = new A();
    p.v2 = 200;
    // A.v2 = 200;
    
    A p2 = new A();
    p2.v2 = 300;
    
    System.out.printf("A.v1 = %d, p.v2 = %d, p2.v2 = %d\n", A.v1, p.v2, p2.v2);
  }

}
