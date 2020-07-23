package com.eomcs.basic.ex04;

public class Exam0422 {
  public static void main(String[] args) {
    double d;
    
    d = 9.99999999988888;
    System.out.println(d);
    
    d = 9999999.88888888;
    System.out.println(d);
    
    d = 99999999998888.8;
    System.out.println(d);
    
    d = 0.00000999999999988888;
    System.out.println(d); // ok!!
    
    d = 9.999999999999997;
    System.out.println(d);
    
    d = 999999999999999.7;
    System.out.println(d);
    
  //실제는 유효자릿수에 해당하는 부동소수점이라도 정규화 과정을 통해 2 진수로 변환되는 과정에서 
  //값이 짤리는 경우가 있음을 잊지 말라!
    
  }

}
