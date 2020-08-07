package com.eomcs.oop.ex03;

public class Exam0140 {
  // instance field = non-static variable
  static class A {
    static int v1;
    static int v2;
  }
  public static void main(String[] args) {
   // 클래스 변수는 클래스가 로딩되는 시점에 Method Area에 생성된다.
   // 클래스가 로딩되는 떄?
   // 로딩되지 않은 클래스를 사용할 때
   // 

   A obj1 = new A();
   A obj2 = new A();

   obj1.v2 = 300;
   obj2.v2 = 300;

   System.out.println(obj1.v2);
   System.out.println(obj2.v2);
  }
}
