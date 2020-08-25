package com.eomcs.basic.ex05;

public class Exam0411 {
  public static void main(String[] args) {
    int a = -0x7f_ff_ff_fa; // 1000_0000_0000_0000_0000_0000_0000_0110
    System.out.println(a);
    System.out.println(a << 1); // 0000_0000_0000_0000_0000_0000_0000_1100
    System.out.println(a << 2);
    System.out.println(a << 3);
    System.out.println(a << 4);
  }

}
