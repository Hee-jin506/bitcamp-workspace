package com.eomcs.basic.ex06;

public class Exam0240 {
  public static void main(String[] args) {
    int level = 1;
    
    switch (level) {
      case 0:
        System.out.println("조회만 가능합니다.");
        break;
      case 1:
        System.out.println("글작성 가능합니다.");
        break;
      case 2:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
    }
  }

}
