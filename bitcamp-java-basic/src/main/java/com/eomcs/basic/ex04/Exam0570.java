package com.eomcs.basic.ex04;

public class Exam0570 {
  public static void main(String[] args) {
    int[] arr1 = new int[5];
    
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
    
    int arr2[] = new int[] {100, 90, 80, 70, 60};
    int arr3[] = {0,0,0,0,0};
    int[] arr4;
    // arr4 = {100, 90, 80, 70, 60} // 컴파일 오류
    // 배열 초기화 명령을 따로 실행할 때는 new int[] 생략할 수 없다.
    int[] arr5;
    arr5 = new int[] {0,0,0,0,0};
  }
}
