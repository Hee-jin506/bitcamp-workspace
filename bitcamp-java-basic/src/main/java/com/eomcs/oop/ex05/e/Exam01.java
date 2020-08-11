// 상속 - 클래스 로딩과 인스턴스 생성 과정
package com.eomcs.oop.ex05.e;

public class Exam01 {
  public static void main(String[] args) {
  B obj = new B();
  obj.v2 = 200;
  obj.v1 = 100;
  System.out.printf("v2 = %d, v1 = %d\n", obj.v1, obj.v2);
  
  B obj2 = new B();
  obj2.v2 = 2000;
  obj2.v1 = 1000;
  System.out.printf("v2 = %d, v1 = %d\n", obj2.v1, obj2.v2);

  }
}

// 용어 정리!
// 상속(inheritance)
// => 기존에 만든 클래스를 자신의 코드처럼 사용하는 기법이다.
// => 보통 기존 코드를 손대지 않고 새 코드를 덧붙일 때 많이 사용한다.
// 
// 수퍼클래스(super class) = 부모클래스(parents class)
// => A 클래스처럼 상속해주는 클래스를 말한다.
// 
// 서브클래스(sub class) = 자식클래스(child class)
// => B 클래스처럼 다른 클래스를 상속 받는 클래스를 말한다.










