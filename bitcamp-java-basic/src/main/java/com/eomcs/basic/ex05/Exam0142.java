package com.eomcs.basic.ex05;

public class Exam0142 {
  public static void main(String[] args) {
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    
    int r1 = x + y;
    
    System.out.println(r1);
    
    long r2 = x + y;
    System.out.println(r2);
    
    // 42억이 출려되지 않고 -2가 출력되는 이유
    // int와 int의 연산 결과는 피연산자와 같은 4바이트 int가 된다.
    // 그래서 8바이트 long 변수에 저장하기 전에 
    // 이미 결과는 int값으로 -2가 되기 때문에
    // long 변수의 값이 -2rk ehlsek.
    
    r2 = (long)x + (long)y;
    System.out.println(r2);
  }

}
