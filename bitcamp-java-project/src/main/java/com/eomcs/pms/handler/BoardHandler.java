package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {
  
  private static final int LENGTH = 100;
  private Board[] list = new Board[LENGTH];
  private int size = 0;
  
  public void add() {
    Board b = new Board();
    System.out.println("[회원 추가]");
    b.no = Prompt.promptInt("번호? ");
    b.title = Prompt.promptString("제목? ");
    b.content = Prompt.promptString("내용? ");
    b.password = Prompt.promptString("암호? ");
    b.writer = Prompt.promptString("작성자? ");
    b.registeredDate = new java.sql.Date(System.currentTimeMillis());
    b.viewCount = 0;
    
    list[size] = b;
    size++;
  }
  
  public void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      Board b = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          b.no, b.title, b.writer, b.registeredDate, b.viewCount);
    }
  }

}
