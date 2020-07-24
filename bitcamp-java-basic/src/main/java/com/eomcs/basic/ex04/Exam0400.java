// 변수의 종류
package com.eomcs.basic.ex04;

public class Exam0400 {
  public static void main(String[] args) {
    // 정수
    byte b;
    short s;
    int i;
    long l;
    
    //부동 소수점
    float f;
    double d;
    
    // 문자
    char c;
    
    // 논리
    boolean bool;
    
    //레퍼런스
    String str;
    
    // 변수의 메모리 크기 리터럴이 int 더라도 범위에 들어가면 ok
    // 정수 리터럴은 기본이 4바이트이다.
    // 원래 작은 메모리에 저장할 수 없지만,
    // 오른쪽 값이 4바이트 정수 리터럴일 경우
    // 메모리에 그 리터럴을 저장할 수 있다면 허락한다.
    b = -128;
    b = 127; // 들어갈 수 있음
    
    // b = -129;// 컴파일 오류 1000 0001(129) 8비트 이미 초과
    // b = 128; // 컴파일 오류 8비트 초과
    
    // 4바이트 리터럴 끼리의 연산 결과는 리터럴로 취급한다.
    // b = 20 * 30;
    
    b = 120 + 7;
    // b = 120 + 8; // 컴파일 오류
    
    // 변수와 리터럴의 합 - int 와 byte끼리의 연산이 됨
    byte b2 = 20;
    // b = 100 + b2;
    
    s = -32768;
    s = 32767;
    // s =-32769; 초과
    // s = 32768; 초과
    
    // int는 21억까지 된다고 생각해라
    i = -21_0000_0000;
    i = 21_0000_0000;
    // i = -22_0000_0000;
    // i = 22_0000_0000;
    
    l = -922_0000_0000_0000_0000l;
    l = 922_0000_0000_0000_0000l;
    // l = -932_0000_0000_0000_0000l;
    // l = -932-0000_0000_0000_0000l; // 초과
    
    b = 100;
    s = 100;
    i = 100;
    
    // 8바이트 리터럴은 무조건 안됨. 
    // b = 100l;
    // s = 100l;
    // i = 100l;
    
    byte b3;
    b3 = b;
    // b3 = s;
    // b3 = i;
    // b3 = l;
    
    short s2;
    s2 = b;
    s2 = s;
    // s2 = i;
    // s2 = l;
    
    int i2;
    
    i2 = b;
    i2 = s;
    i2 = i;
    // i2 = l;
    
    long l2;
    
    l2 = b;
    l2 = s;
    l2 = i;
    l2 = l;
    
    s = -32768;
    s = 32767;
    char c2;
    // c2 = -32768;
    c2 = 0;
    c2 = 65535;
    // c2 = 65536;
    
    // c2 = s
    // s = c2
    
    f = 999.9999f;
    f = 9.999999f;
    f = 999999.9f;
    
    // 부동 소수점은 7자리 까지의 숫자만
    // 유효하다.
    // 그 이상의 자릿수인 경우 값이 잘린다.
    // 또는 반올림 처리된다.
    // 유효자릿수를 넘어간다고 오류가 발생하지는 않는다.
    f = 999.99993f;
    System.out.println(f);
    
    float f1 = 1.234567f;
    float f2 = 92345.22f;
    float f3 = f1 + f2; // float + float = float 12346.454567
    double dx = f1 + f2; // dx = 12346.45xxxxxxx 이미 잘린 값이 들어
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(dx);
    // 8자리부터는 30프로정도만 저장하고 나머지는 저장 못함
    // 4바이트 메모리는 7자리수는 99.9%정도만 저장할 수 있다.
    
    // 두 부동소수점의 값이 연산한 결과가
    // 7자리를 넘어갈 것 같으면 
    // 처음부터 더블을 사용해라. 
    double d1 = 1.234567;
    double d2 = 92345.22;
    double d3 = d1 + d2; // 12346.454567

    System.out.println("===>");
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
  
    
    // 16자리는 10프로정도 빼고는 잘 나옴.
    // 17자리부터는 정상적으로 들어가는 비율이 아주 낮아짐
    // 부동 소수점에서는 100프로 정확도는 없다.
    // 가수부에서 끝까지 안나눠떨어질수 있기 때문
    // 7자리와 15자리가 안전 범위라고 기억해두셈.
    d = 299992999.99999997;
    System.out.println(d);
    

    // f = 2345678912.123456;
    f = 2345678912.123456f;
    // 정수와 비교해보면
    // i = 22_0000_0000l;
    // 부동 소수점 메모리 8바이트는 f를 붙이면 4바이트 값으로 만든다.
    // 4바이트를 넘어가는 값은 자르기 때문
    // 따라서 f에 들어가는 값은 이미 잘린 값
    // 그래서 오류없이 4바이트 메모리에 들어가는 것
    System.out.println(f);
    
    d = 234.5678;
    System.out.println(d);
    
    f = 234.5678f;
    System.out.println(f);
    
    // 리터럴이 이미 표현된 순간부터 4바이트 형식으로 짜여짐
    // 8바이트 메모리에 이걸 넣으면 남은 부분을 막 채움
    d = 234.5678f;
    System.out.println(d);
    
    // 그냥 더블이나 플럿 둘 중에 하나만 써라
    // 섞어 쓰지 마라
    
    // 3D 그래픽 처리에서 부동소수점 연산이 이뤄지므로 연산이 느림
    // 컴퓨터 그래픽 카드 CPU(GPU)가 그 연산을 처리함.
    // Graphic process unit - 빠른 클럭으로 부동소수점 연산에 특화
    // 클럭이 너무 빨라 열이 발생하므로 그래픽 카드에 팬이 달린 것
    // Central process unit - 정수와 부동소수점 연산 모두
    
    // 메모리는? 자바는 메모리를 8바이트까지 하나하나 아낄필요 없음
    
    
  }
}