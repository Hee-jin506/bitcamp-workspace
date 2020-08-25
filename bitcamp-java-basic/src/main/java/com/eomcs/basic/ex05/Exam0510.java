package com.eomcs.basic.ex05;

public class Exam0510 {
  public static void main(String[] args) {
    int age = 20;
    
    String message = (age > 18) ? "성년" : "미성년";
    
    // (age > 18) ? System.out.println("성인이다.) :
                    // System.out.println("미성년자이다.")
    // 표현식 자리에는 꼭 실행 결과가 놓여져야한다.
    
    System.out.printf("나이 %d는 %s이다.\n", age, message);
    
  }

}
