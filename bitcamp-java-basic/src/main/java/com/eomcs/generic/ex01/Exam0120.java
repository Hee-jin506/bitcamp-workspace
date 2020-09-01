package com.eomcs.generic.ex01;

import com.eomcs.algorithm.data_structure.array.ArrayList;

public class Exam0120 {
  
  public static void main(String[] args) {
    
    ArrayList<Member> list = new ArrayList<Member>();
    list.add(new Member("홍길동", 20));
    // list.add(new String("Hello!"));
    // list.add(new Intger(100));
    // list.add(new HashSet()):
    
    Member member = list.get(0);
    System.out.println(member.name);
    System.out.println(member.age);
    
    // 한개의 클래스로 형변화 없이 특정 타입 전용 클래스로 만들 수 있다.
  }

}
