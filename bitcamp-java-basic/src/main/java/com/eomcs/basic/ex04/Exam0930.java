package com.eomcs.basic.ex04;

public class Exam0930 {
  public static void main(String[] args) {
    // 강제로 형변환하여 부동소수점 값을 정수 메모리에 저장
    float f = 3.14f;
    int i = (int)f;
    System.out.println(i);
    
    // double ==> long
    double d = 9876.56789;
    long l = (long)d;
    System.out.println(l);
  }
}
// 명시적 형변환
// - 큰메모리의 값을 작은 메모리로 변환할때 
// - 부동 소수점을 정수로 변환할때
// - 문법
// 변수 = (바꾸고자 하는 타입) 변수 또는 값
