package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 : 다음 int 변수에 들어있는 값을 
//  다음과 같이 순서대로 출력하라
//실행 예)
// aa
// bb
// cc
// dd
public class Test03 {

  public static void main(String[] args) {
    int value = 0xaabbccdd;
    int a = (value >>> 24);
    System.out.println(Integer.toHexString(a));
    
    int b = (value >>> 16) & 0xff;
    System.out.println(Integer.toHexString(b));
    
    int c = (value >>> 8) & 0xff;
    System.out.println(Integer.toHexString(c));
    
    int d = value & 0xff;
    System.out.println(Integer.toHexString(d));
  }

}








