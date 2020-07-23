// 변수 선언
// - 데이터를 저장할 메모리를 확보하는 명령

package com.eomcs.basic.ex04;

public class Exam0110 {
  public static void main(String[] args) {
    int i;
    int i2;
    int i3;
    
    int x, y, z;

    i = 100;
    // 오른쪽 값을 왼쪽 메모리에 넣는 '할당(배정) 연산자' assignment operator
    // 연산자 기준 왼쪽을 L-value, 오른쪽으로 R-value라고 함
    // L-value에는 메모리만 올 수 있고, R-value는 값이나 메모리 둘다 올 수 있다.
    // L-value에는 값이 못온다.
    x = i;
    y = i * x;
    // R-value에는 표현식이 올 수 있다. expression
    // 문장에 속하는 표현식은 결과를 생성하는 리턴 문장을 말한다.
    // 예시) a + b. a > b, plus(10,20)
    // 문장은 명령어의 집합. 변수선언도 문장, 메소드 선언도 문장, 클래스 선언도 문장
    // 영어로는 statement
    
    byte b1;
    byte b2;
    
    b1 = 10; // [00001010]
    b2 = 12; // [00001100]
    b1 = b2; // [00001100]
    
    i = b1; // byte 메모리를 int에 넣는다면 [00000000000000000001100]
    // 큰 메모리에 작은 메모리 값을 집어넣으면 나머지는 0으로 채워짐
    
    // b2 = i; // 자바에서는 작은 메모리에 큰 메모리값을 집어넣으면 안됨
    // 컴파일 에러
    
    b2 = (byte)i; // 잘려도 상관없다면 이렇게 할 수 있음
    
    int a = 100;
    int b = 200;
    
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10; // [00001010]
    xx = 12; // [00001100]
    xx =78; // [01001110]
  }
}
