package com.eomcs.oop.ex09.e2;

public class NewComputer2 implements Computer {
  @Override
  public void compute() {
    System.out.println("새 컴퓨터..");
  }
  
  @Override
  public void touch() {
    System.out.println("오호라! 터치가 되네. 이거 서피스 프로인가");
  }
}
