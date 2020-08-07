package com.eomcs.oop.ex03;

public class Exam0670 {
  public static class A {
    static int a = 100;
    
    // -> static {
    //      a = 100;
    //    }
  }
  public static void main(String[] args) {
    System.out.println(A.a);
  }

}
