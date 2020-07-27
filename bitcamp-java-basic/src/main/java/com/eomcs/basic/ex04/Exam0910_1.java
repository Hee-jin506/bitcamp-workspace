package com.eomcs.basic.ex04;

public class Exam0910_1 {
  public static void main(String[] args) {
    byte b = 100;
    short s = 100;
    int i = 98765678;
    long l = 98765678;
    char c = 100;
    
    float f;
    double d;
    
    // 정수변수의 값을 부동소수점 변수에 저장할때
    // 값이 짤릴 수 있다.
    f = b; 
    System.out.println(f);
    
    f = s;
    System.out.println(f);
    
    f = c;
    System.out.println(f);
    
    f = i;
    System.out.println(f);
    
    f = l;
    System.out.println(f);
    
    d = i;
    System.out.println(d);
    
    l = 18_2345_3456_4567_5678L;
    d = l;
    System.out.println(d);
  }

}
