package com.eomcs.oop.ex10.c2;

public abstract class Building {
  
  public void build() {
    System.out.println("건축하겠습니다!");
    startEffect();
    
    System.out.println("건축이 완료되었습니다.");
    endEffect();
  }
  
  public abstract void startEffect();
  public abstract void endEffect();

}
