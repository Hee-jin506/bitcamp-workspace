package com.eomcs.oop.ex03;

public class Exam0410 {
  
  //public Exam0410() {}
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
    
    Score() {
      System.out.println("Score()");
    }
    
    public void computs() {
      this.sum = this.kor + this.eng + this.math;
      this.average = this.sum / 3f;
    }
  }
  
  public static void main(String[] args) {
    Score s1 = new Score();
    
    // 생성자를 호출하지 않을 수 있는가?
    // Score s2 = new Score;
    
    Score s3 = new Score();
  }

}
