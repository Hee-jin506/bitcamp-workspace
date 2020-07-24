package com.eomcs.basic.ex03;

//# 정수 리터럴 - 자릿수 표기
//- 정수를 읽기 쉽도록 밑줄(underscore; _)을 숫자 사이에 삽입할 수 있다. 
//
public class Exam0220 {
  public static void main(String[] args) {
    
    System.out.println(12783406);
    System.out.println(1278_3406);
    System.out.println(12_783_406);
    
    // 8진수 앞에는 0을 붙임.
    System.out.println(077);
    System.out.println(0_77);
    System.out.println(07_7);
    
    // 맨 앞이나 맨 뒤에 삽입 불
    // System.out.println(_077);
    // System.out.println(077_);
    
    System.out.println(0b1100100);
    System.out.println(0b110_0100);
    System.out.println(0b1_1_0_0_1_0_0);
    
    System.out.println(0xffaa);
    System.out.println(0xff_aa);
    
    
    
  }
}