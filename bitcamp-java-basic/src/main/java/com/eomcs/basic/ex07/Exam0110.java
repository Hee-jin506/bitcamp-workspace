package com.eomcs.basic.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Exam0110 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();
    keyScan.close();


    for (int starLen = 1; starLen <= len; starLen += 2) {
      printSpace(getSpaceLen(len, starLen));
      printStar(starLen);
      System.out.println();
      }
    }
  static int getSpaceLen(int len, int starLen) {
    return (len - starLen) / 2;
  }

  static void printSpace(int length) {
    for (int i = 0; i < length; i++) {
      System.out.print(" ");
      }
    }
  static void printStar(int length) {
    for (int i = 1; i <= length; i++) {
      System.out.print("*");
      }
  }
}