package com.eomcs.basic.ex03;

//# 문자 리터럴

public class Exam0410 {
  public static void main(String[] args) {
    
    // 자바는 문자를 메모리에 저장할 때 unicode 규칙에 따라
    // 2바이트 코드로 저장한다.
    // => 'A' : 0x0041
    // => 'B' : 0x0042
    // => '1' : 0x0031
    
    //println()
    // -> 출력 값으로 문자코드가 주어지면
    // 해당 코드의 문자를 폰트 파일에서 찾아 출력
    // 
    // 작은 따옴표를 사용하여 문자를 표현한다.
    System.out.println('A');  // 0x0041 
    System.out.println('가'); // 0xac00
    System.out.println('\u0041'); //유니코드 값 직접 지정
    System.out.println('\u4eba');
    
    // 그냥 숫자를 주면 println()은 일반 정수값으로 출
    System.out.println(0x41);
  }
}

