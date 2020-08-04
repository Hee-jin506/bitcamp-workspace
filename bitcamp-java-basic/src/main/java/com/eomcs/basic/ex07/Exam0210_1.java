package com.eomcs.basic.ex07;

public class Exam0210_1 {
  static void hello() {
    System.out.println("안녕하세요!");
    System.out.println("이 메서드는 어떤 값도 리턴하지 않습니다.");
  }
  public static void main(String[] args) {
     hello();
     System.out.println("hello() 실행 완료!");

     // hello(100);
     int i;
     // i = hello();

     // 메서드명, 변수 선언 : 메서드 시그니처
     // 메서드 블록 : 메서드 몸체

     // 메서드 종류?
     // 1) 클래스 메서드
     // - 클래스에 소속되어있다
     // - 모든 인스턴스에 대해 사용할 수 있다.
     // 2) 인스턴스 메서드
     // - 인스턴스에 대해 사용할 수 있다.
     // - static 이 붙지 않는다.
  }
}
