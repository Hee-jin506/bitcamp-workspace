package com.eomcs.basic.ex07;

public class Exam0450 {

  static int sum(int value, int count) {
    if (count == 5)
      return 0;

    return value + sum(value, count + 1);
  }

  public static void main(String[] args) {
    System.out.println(sum(5, 1));
  }

}
