package com.eomcs.basic.ex03;

//# 문자 리터럴

public class Exam0420 {
  public static void main(String[] args) {
    
    // 문자코드임을 알려줘라 
    System.out.println((char)0x41);
    System.out.println((char)65);
    System.out.println((char)0xd5d0);
    
    System.out.println('A'); // 'A' => (char)0x41
    // single quotation 연산자 ''의 역할?
    // => 문자의 코드값을 리턴해주는 일을 한다.
  }
}

