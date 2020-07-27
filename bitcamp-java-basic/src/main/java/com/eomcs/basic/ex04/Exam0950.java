package com.eomcs.basic.ex04;

public class Exam0950 {
  public static void main(String[] args) {
    // 명시적 형변환이 가능한 경우
    // 1) 정수 메모리끼리
    // 2) 부동소수점을 정수로 형변환
    // 3) 형변환 없이 정수는 부동소수점 메모리에 저장
    // 4) 숫자를 문자코드로
    // 그외에는 형변환 불가능
    
    // 예) 정수, 부동소수점 ==/==> boolean
    boolean bool;
    // bool = (boolean) 1;
    
    // 예) 문자열 ==/==> 정수, 부동소수점, 문자, boolean!!!!
    // boolean v1 = (boolean) "true";
    // char v2 = (char) "가";
    // int v3 = (int) "123";
    // float v4 = (int) "3.14f";
  }

}
