package com.eomcs.oop.ex01;


class A {}
// 패키지 멤버 클래스
// 단독으로 선언하는 클래스이다.
// 파일에 여러개의 클래스를 선언할 수도 있지만
// 보통은 한 파일에 한 클래스를 선언한다.
// 패키지 멤버 클래스는 접근 권한이 있다면 누구든 사용할 수 있다.

public class Exam0510 {
  

  // 중첩 클래스
  // 다른 클래스 안에 정의된 클래스
  // - 스태틱 중첩 클래스
  // - 논스태틱 중첩 클래스
  // - 로컬 클래스
  // - 익명 클래스
  
  // 1) 스태틱 중첩 클래스
  // 이 클래스를 소유하고 있는 클래스 뿐만 아니라 다른 클래스도 사용 가능
  static class B {}
  
  // 2) 논 스태틱 중첩 클래스
  // 특정 인스턴스에 종속된 클래스인 경우 논 스태틱 중첩 클래스로 정의
  class C {}
  
  public static void main(String[] args) {
    // 3) 로컬 클래스
    // 메서드 블록 안에 정의된 클래스
    // 오직 그 메서드 블록 안에서만 사용
    class D {}
    
    // 4) 익명 클래스
    // 클래스 이름이 없는 중첩 클래스이다
    // 딱 한개의 인스턴스를 생성할 때 사용한다.
    // 클래스를 정의할 때 수퍼 클래스나 인터페이스를 지정해야한다.
    // 클래스를 정의할 때 new 연산자를 사용하여 즉시 인스턴스를 생성한다.
    
  }
}
