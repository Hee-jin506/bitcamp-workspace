package com.eomcs.basic.ex03;

public class Exam0500 {
  public static void main(String[] args) {
    System.out.println(true);
    System.out.println(false);
    
    System.out.println(4 < 5);
    System.out.println(4 > 5);
    
    System.out.println(true && false);
    System.out.println(true || false);
    
    System.out.println(65 == 'A');
    System.out.println(65 == 'B');
    
    // 숫자를 true/false로 변환할 수 없다.
    // System.out.println((boolean)1);
    
    // 논리값을 메모리에 저장할 때 크기
    // 4바이트 int 메모리에 저장한다.
    // 배열 값인 경우 1바이트 메모리에 저장한다.
    // true는 1, false는 0 값으로 저장
    // 그렇다고 직접 정수 값을 지정해서는 안된다.
    // c언어의 경우 자바의 true, false처럼 논리 값을 표현하는 키워드가 없다.
    
  }

}
