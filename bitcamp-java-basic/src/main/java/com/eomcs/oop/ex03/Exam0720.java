package com.eomcs.oop.ex03;

public class Exam0720 {
  static class A {
    int a;
    int b;
    int c;
    public A() {
      a = 200;
      System.out.println("A() 생성자 호출");
    }
    
    {
      a = 100;
      System.out.println("인스턴스 초기화 블록 실행");
    }
    
  }
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b= %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }
}
