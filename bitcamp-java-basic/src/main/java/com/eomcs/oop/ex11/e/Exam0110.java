package com.eomcs.oop.ex11.e;

public class Exam0110 {
  
  interface A {
    void print();
  }
  
  public static void main(String[] args) {
    class X implements A {
      @Override
      public void print() {
        System.out.println("Hello");
      }
    }
    A x = new X();
    x.print();
  }

}
