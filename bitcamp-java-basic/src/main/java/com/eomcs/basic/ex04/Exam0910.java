package com.eomcs.basic.ex04;

public class Exam0910 {
  public static void main(String[] args) {
    byte b = 100;
    short s = 100;
    int i = 100;
    long l = 100;
    float f = 100f;
    double d = 100.0;
    boolean bool = true;
    char c = 'A';
    
    // 변수의 값을 다른 변수에 저장하는 기본 원칙!
    // - 반드시 같은 데이터 타입이어야한다.
    // - 같은 데이터 타입이라도 저장하는 값의 크기가
    //   변수보다 작거나 같아야한다.
    // 
    // 정수 ==> 부동소수점 변수
    // - 정수 변수의 값을 부동소수점 변수에 저장하는 것을 허용한다.
    // - 이를 위해 값을 저장하기전에 정수 변수에 들어있는 값을
    //   부동소수점으로 자동 변환시킨다.
    float f2;
    f2 = b;
    System.out.println(b);
    f2 = s;
    System.out.println(s);
    f2 = i;
    System.out.println(i);
    f2 = l;
    System.out.println(l);
    f2 = c;
    System.out.println(c);
    
    System.out.println("2---------------");
    s = 32767;
    f2 = s;
    System.out.println(f2);
    
    i = 17_3456_1234;
    f2 = i; // 유효자릿수를 벗어난 수는 잘린다.
    System.out.println(f2);
    // 뒤에 두자리는 잘라버림. 17234561280
    // int를 float에 저장할때 컴파일 오류는 발생하지 않는다.
    // 다만 실행시에 float 메모리에 저장되는 과정에서
    // 유효자릿수가 넘어가는 값은 잘린다.
    
    l = 200_1234_3654l;
    f2 = l; // 유효자릿수를 벗어난 수는 잘린다.
    System.out.println(f2);
    
    // 부동소수점 => 정수 변수
    // 부동소수점은 정수변수에 저장 불가
    // 사이즈가 같거나 큰 int 나 long 도 마찬가지 
    //
    f = 112.123f;
    // b = f; // 문법 오류!
    // s = f;
    // i = f;
    // l = f;
    
    System.out.println("3---------------------");
    // 강제로 부동소수점을 정수 변수에 저장하는 방법
    // - 형변환 명령을 사용하라!
    b = (byte) f; // 소수점 이하가 잘린다
    System.out.println(b);
    
    s = (short) f;
    System.out.println(s);
    
    i = (int) f;
    System.out.println(i);
    
    l = (long) f;
    System.out.println(l);
    
    c = (char) f;
    System.out.println(c);
    
    // 이렇게 명령어를 통해 강제로 형변환시키는 것을
    // "명시적 형변환(explicit type conversion/casting)"이라 부른다.
    
    // 단 논리값을 정수나 부동소수점으로 바꿀 수 없다.
    // b = (byte) bool;
    // s = (short) bool
    // i = (int) bool;
    // l = (long) bool;
    // f = (float) bool;
    // d = (double) bool;
    // c = (char) bool;
    
    // bool = (boolean) b;
    // bool = (boolean) s;
    // bool = (boolean) i;
    // bool = (boolean) l;
    // bool = (boolean) f;
    // bool = (boolean) d;
    // bool = (boolean) c;
    
    System.out.println("4-----------------");
    // 같은 정수 변수 끼리 변환
    // 작은 메모리 ==> 큰 메모리 : ok
    // 큰 메모리 ==> 작은 메모리 : 명시적 형변환 ok
    // - 형변환 값이 메모리에 저장하지 못할 만큼 크다면 잘린다.
    // 
    b = (byte)s;
    System.out.println(b);
    b = (byte)i;
    System.out.println(b);
    b = (byte)l;
    System.out.println(b);
    
    l = 130;
    b = (byte) l;
    System.out.println(b);

  }
}
