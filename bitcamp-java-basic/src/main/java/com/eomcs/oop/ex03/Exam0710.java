package com.eomcs.oop.ex03;

public class Exam0710 {
  
  static class A {
    int a;
    int b;
    int c;
    
    // 인스턴스 초기화 블록 사용 후
    // 여러 생성자에 공통으로 존재하는 코드가있다면
    // 별도의 블록으로 뽑아내는 것이 소스 코드 관리에 좋다.
    {
      a = 100;
      System.out.println("Hello!");
    }
    
//    public A() {
//      a = 100;
//      System.out.println("Hello!");
//    }
  }
  
  public static void main(String[] args) {
    A obj1 = new A();
    System.out.printf("a = %d, b = %d, c = %d\n", obj1.a, obj1.b, obj1.c);
  }

}
