package com.eomcs.oop.ex03;

public class Exam0680 {
  public static class A {
    static int a = 100;
    
    static {
      a = 200;
      System.out.println("static{} 실행");
    }
    
    static int b = 300;
    
    static {
      b = 400;
    }
    // 변수 초기화 문장을 컴파일 할 때,
    // 일단 스태틱 필드(a, b)를 먼저 만든다.
    // 스태틱 변수 초기화 문장을 스태틱 블록으로 변경한 다음에
    // 모든 스태틱 블록을 순서대로 한 스태틱 블록으로 합친다.
    // 스태틱 변수 초기화 문장과 스태틱 블록을 구분하지 않
    // 선언한 순서대로
    // 하나의 스태틱 블록에 합친다.
    // 위의 문장은 다음 문장으로 바뀐다.
    // static int a;
    // static int b;
    // static {
    //   a = 100;
    //   a = 200;
    //   System.out.println("static{} 실행");
    //   b = 300;
    //   b = 400;
    
  }

  public static void main(String[] args) {
    System.out.println(A.a);
    System.out.println(A.b);
  }
}
