package com.eomcs.basic.ex05;

public class Exam0354 {
  public static void main(String[] args) {
    int pixel = 0x003f4478;
    System.out.println(Integer.toHexString(pixel & 0x0000ffff));
  }

}
