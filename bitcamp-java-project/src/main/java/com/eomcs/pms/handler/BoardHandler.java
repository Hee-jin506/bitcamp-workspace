package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {
  
  BoardList boardList = new BoardList();
  MemberHandler memberHandler;
  public String type;
  
  public BoardHandler(String type, MemberHandler memberHandler) {
    this.type = type;
    this.memberHandler = memberHandler;
  }
  
  public void add() {
    System.out.println("[게시물 등록]");
    
    Board board = new Board();
    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    while (true) {
      String name = Prompt.inputString("작성자?(취소: 빈 문자열) ");
      
      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        board.writer = name;
        break;
      }
      
      System.out.println("등록된 회원이 아닙니다.");
    }
    board.registeredDate = new java.sql.Date(System.currentTimeMillis());
    
    boardList.add(board);
  }
  
  public void list() {
    System.out.println("[게시물 목록]");
    Board[] boards = boardList.toArray();
    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          board.no, 
          board.title, 
          board.writer,  
          board.registeredDate,
          board.viewCount);
    }
  }
}
