package com.eomcs.basic.ex07;

public class Exam0520 {
  public static void main(String[] args) {
    for (String value : args) {
      System.out.printf("[%s]\n", value);
    }
    System.out.println("종료!");
  }

}
// 프로그램 아규먼트
// jvm을 실행할 때 프로그램에 전달하는 값
