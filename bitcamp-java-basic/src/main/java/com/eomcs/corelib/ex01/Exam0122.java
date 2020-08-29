// Object 클래스의 메서드를 오버라이딩 하기 - toString()
package com.eomcs.corelib.ex01;

public class Exam0122 extends Object {
  static class Score /* extends Object*/ {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }
  }
  
  public static void main(String[] args) {
    Score s1 = new Score("홍길동", 100, 100, 100);
    
    String str = s1.toString();
    System.out.println(str);
  }
}