package com.eomcs.basic.ex06;

public class Exam0310_1 {
  public static void main(String[] args) {
    int count = 0;
    while (count < 5) System.out.println(count++);
    System.out.println("--------------------------");

    count = 0;
    while (count < 5)
      System.out.println(count++);

    System.out.println("--------------------");

    count = 0;
    while (count < 5) {
      System.out.println(count);
      count++;
    }
  }
}
