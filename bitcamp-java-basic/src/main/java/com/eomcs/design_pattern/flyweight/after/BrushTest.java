package com.eomcs.design_pattern.flyweight.after;

import java.util.Scanner;

public class BrushTest {
  
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    BrushPool brushPool = new BrushPool();
    
    for (int i = 0; i < 20; i++) {
      System.out.print("패턴? ");
      String pattern = keyboard.nextLine();
      System.out.print("선 길이? ");
      int length = Integer.parseInt(keyboard.nextLine());
      if (length < 0)
        break;
      
      // 사용자가 입력한 패턴의 브러시를 브러시 풀에서 꺼내 쓴다.
      // - 매번 생성하지 않으므로 가비지가 줄어든다.
      // - 이것이 Flyweight 패턴을 사용하는 이유이다.
      // 이렇게 생성한 후 보관해두었다가 재사용하는 방식을
      // Pooling 기법이라고 한다.
      // 디자인 패턴에서는 Flyweight 패턴으로 정리되어있다.
      Brush brush = brushPool.getBrush(pattern);
      brush.draw(length);
      
      
    }
  }
}
