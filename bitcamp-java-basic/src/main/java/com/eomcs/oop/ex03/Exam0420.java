package com.eomcs.oop.ex03;

public class Exam0420 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
    
    Score(String name, int kor, int eng, int math) {
      System.out.println("Score(String, int, int, int) 호출!");
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }
    
    public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.average = this.sum / 3f;
    }
  }
  
  public static void main(String[] args) {
    // Score s0 = new Score();
    
    Score s1 = new Score("홍길동", 100, 90, 77);
    Score s2 = new Score("임꺽정", 80, 88, 87);
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);
  }
}
