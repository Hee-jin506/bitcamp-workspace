package com.eomcs.basic.ex04;

public class Exam0910 {
  public static void main(String[] args) {
    byte b = 100;
    short s = 100;
    int i = 98765678;
    long l = 98765678;
    char c = 100;
    
    float f;
    double d;
    
    f = b; // byte(1) 
    
    f = s;
    
    f = c;
    
    f = i; 
    //=> 유효자릿수를 넘는 정수는 짤린다.
    // 컴파일 오류 없음
    
    f = l;
    // => 유효자릿수를 넘는 정수는 짤린다.
    // 컴파일 오류 없음
    
    d = i;
    
    l = 18_2345_3456_4567_5678L;
    d = l;
    // 유효 범위를 넘어가면 짤린다.
    // 컴파일 오류 없음
    System.out.println(d);
  }

}
