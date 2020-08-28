package com.eomcs.oop.ex01;

// 특정 패키지의 클래스를 너무 많이 사용한다면 다음과 같이 패키지명 다음에 wildcard(*)를 지정할 수 있다.
// 이경우 해당 패키지에 있는 모든 클래스를 패키지명 없이 사용할 수 있다.
// 단 서브 패키지는 해당 안된다.
// 단 소스 코드를 읽을 때 어떤 클래스가 어떤 패키지에 있는 지 바로 확인할 수 없는 불편함이 있다.
// 그래서 개발자들은 널리 알려진 클래스가 아닐 경우에
// 가능한 패키지명과 클래스명을 정확하게 명시한다.
import com.eomcs.oop.ex01.sub.Y2;

public class Exam0730 {
  public static void main(String[] args) {
    Y2 obj;
    obj = new Y2();
  }

}
