package com.eomcs.oop.ex01;

public class Exam0113 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  public static void main(String[] args) {
    Score s = new Score();
    
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    
    printScore(s);
  }
  
  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

}
