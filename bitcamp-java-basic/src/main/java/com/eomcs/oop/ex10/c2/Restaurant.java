package com.eomcs.oop.ex10.c2;

public class Restaurant extends Building {
  
  @Override
  public void startEffect() {
    System.out.println("뚝딱...뚝딱~~~~~");
  }
  
  @Override
  public void endEffect() {
    System.out.println("와우~~~ 배고픔에서 해방!");
  }

}
