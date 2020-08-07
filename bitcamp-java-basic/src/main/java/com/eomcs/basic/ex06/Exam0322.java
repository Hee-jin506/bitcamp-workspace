package com.eomcs.basic.ex06;

public class Exam0322 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    
    count = 0;
    sum = 0;
    while (count < 100) {
      count ++;
      if (count > 50)
        continue;
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
    
    System.out.println("-----------------------------");
    
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        break;
      sum += count;
      
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }

}
