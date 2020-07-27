package com.eomcs.basic.ex04;

public class Exam0822 {
  public static void main(String[] args) {
    int a = 100;
    
    switch (a) {
      case 1:
        // int a; // 컴파일 오류!
        int b;
        {
          int c;
        }
        break;
      case 2:
        // case는 다른 블록으로 취급 되지 않는다!!!
        // int b; // 컴파일 오류
        int c;
      case 3:
        for (int i = 0; i < 100; i++) {
          // int b; // 컴파일 오류 
        }
        break;
      default:
    }
  }
}
