// 메서드 오버로딩(overloading) - 정의하는 규칙과 사용 규칙
package com.eomcs.oop.ex06.b;

public class Exam0210 {
  public static void main(String[] args) {
    A.m();
    
    A.m(100);
    
    A.m("Hello");
    
    A.m(100, "Hello");
    
    A.m("Hello", 100);
    
    // A.m(3.14f);
    // A.m(100L);
  }
}

// 오버로딩(overloading)
// => 파라미터 타입이나 개수, 순서는 다르지만 이름이 같은 메서드를 여러 개 만들 수 있는 문법
//
// 왜 이런 문법이 등장했는가?
// => 파라미터의 형식은 다르지만 같은 기능을 수행하는 메서드에 대해 
//    같은 이름을 부여함으로써 프로그래밍의 일관성을 제공하기 위함.  





