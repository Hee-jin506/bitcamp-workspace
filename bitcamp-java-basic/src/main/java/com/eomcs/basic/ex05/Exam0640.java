package com.eomcs.basic.ex05;

public class Exam0640 {
  public static void main(String[] args) {
    int i = 2;
    int result = i++ + i++ * i++;
    System.out.printf("%d, %d\n", i, result);
  }

}
