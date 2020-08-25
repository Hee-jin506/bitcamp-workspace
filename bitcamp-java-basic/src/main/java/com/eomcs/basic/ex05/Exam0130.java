package com.eomcs.basic.ex05;

public class Exam0130 {
  public static void main(String[] args) {
    byte b;
    b = 5;
    b = 6;
    
    b = 5 + 6;
    
    System.out.println(b);
    
    byte x = 5, y = 6, z;
    z = x;
    z = y;
    
    // z = x + y
    // 자바의 정수 연산은 최소 단위가 4바이트이다.
    // 그래서 byte나 short의 연산 단위가 기본으로 4바이트이다.
    // 자바는 정수 변수에 대해 산술 연산을 할 때
    // 그 변수의 값이 4바이트보다 작으면 
    // 4바이트로 만들어 연산을 수행한다.
    // 따라서 연산 결과도 당연히 4바이트이다.
    // 그래서 4바이트 값을 1바이트 메모리에 넣지 못하기 때문에 
    // 컴파일 오류가 발생하는 것이다.
    
    short s1 = 5;
    short s2 = 6;
    short s3;
    
    s3 = s1;
    s3 = s2;
    // s3 = s1 + s2;
    
    int s4 = s1 + s2;
    System.out.println(s4);
  }

}
