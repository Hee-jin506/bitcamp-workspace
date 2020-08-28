package com.eomcs.oop.ex01;

public class Exam0220 {
  public static void main(String[] args) {
    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }
    
    Score[] arr = new Score[3];
    
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    
    System.out.println("-----------------");
    
    arr[0] = new Score();
    arr[1] = new Score();
    arr[2] = new Score();
  }

}
