package com.eomcs.oop.ex03;

public class Exam0760 {
  public static void main(String[] args) {
    
    // 인스턴스 초기화 블록의 용도
    // 1) 여러 생성자에 공통으로 들어가는 초기화 문장 작성
    // 2) 생성자를 만들지 못하는 상황에서 복잡한 로직에 따라
    // 인스턴스 피드를 초기화시켜야할 때
    
    // 생성자를 만들지 못하는 상황?
    // 익명 클래스를 만들 때이다.
    // 클래스 이름이 없기 때문에 생성자를 만들 수 없다.
    
    Object obj1 = new Object() {
      {
        System.out.println("인스턴스 블록...");
      }
    };
  }

}
