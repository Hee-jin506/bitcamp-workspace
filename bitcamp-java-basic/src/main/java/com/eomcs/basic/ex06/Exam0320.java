package com.eomcs.basic.ex06;

public class Exam0320 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    
    while (count < 100) {
      // count++;
      // sum += count;
      sum += ++count;
    }
    System.out.printf("count=%d, sum = %d", count , sum);
  }

}
