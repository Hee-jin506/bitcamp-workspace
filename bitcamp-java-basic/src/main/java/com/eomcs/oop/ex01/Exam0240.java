package com.eomcs.oop.ex01;

public class Exam0240 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  public static void main(String[] args) {
    Score[] arr = new Score[3];
    
    arr[0] = createScore("홍길동", 100, 100, 100);
    arr[1] = createScore("임꺽정", 90, 90, 90);
    arr[2] = createScore("유관순", 80, 80, 80);
    
    printScoreList(arr);
  }
  
  static Score createScore(String name, int kor, int eng, int math) {
    Score s = new Score();
    
    s.name = name;
    s.kor = kor;
    s.eng = eng;
    s.math = math;
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
    
    return s;
  }
  
  static void printScoreList(Score[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
          arr[i].name, arr[i].kor, arr[i].eng, arr[i].math, arr[i].sum, arr[i].aver);
    }
  }
}
