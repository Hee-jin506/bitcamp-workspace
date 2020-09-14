package com.eomcs.oop.ex11.e;

public class Exam0120 {
  
  interface A {
    void print();
  }
  
  public static void main(String[] args) {
    
    A x = new A() {
      @Override
      public void print() {
        System.out.println("Hello");
      }
    };
    
    x.print();
    
  }
}
