package com.eomcs.basic.ex05;

public class Exam0141 {
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    float r = i / j;
    System.out.println(r);
    
    r = (float)i / (float)j;
    System.out.println(r);
    
    // int와 int의 연산 결과는 int
    // float과 float의 연산 결과는 float
    // 연산결과는 피연산자의 타입과 같다.
    // 두 값을 계산한 결과가 메모리를 초과할 경우
    // 값이 짤릴 수 있다.
    
    // 형변환은 원래 변수의 타입을 바꾸는 것이 아니다.
    // 내부적으로 변수에 들어있는 값을 꺼내 지정된 타입의 임시 메모리를 만들어 저장한다.
    
    // 암시적 형변환
    // - 내부적으로 자동 형변환을 하는 것
    // byte + byte = int
    // short + short = int
    // byte + short = int
    
    // - 다른 타입과 연산 수행 할때는 자동형변환을 통해 같은 타입으로 맞춘다.
  }

}
