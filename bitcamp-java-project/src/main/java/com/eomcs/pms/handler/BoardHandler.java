package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.LinkedList;
import com.eomcs.util.Prompt;

public class BoardHandler {

  // Board 타입의 객체 목록을 저장할 ArrayList 객체를 준비한다.
  // 제네릭 문법으로 항목의 타입을 지정한다.
  LinkedList<Board> boardList = new LinkedList<>();

  public void add() {
    System.out.println("[게시물 등록]");

    Board board = new Board();
    board.setNo(Prompt.inputInt("번호? "));
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));
    board.setWriter(Prompt.inputString("작성자? "));
    board.setRegisteredDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    // 제네릭 문법에 따라 add()를 호출할 때 넘겨줄 수 있는 값은 
    // Board 또는 그 하위 타입의 인스턴스만 가능하다.
    // 다른 타입은 불가능하다.
    boardList.add(board);

    System.out.println("게시글을 등록하였습니다.");
  }

  public void list() {
    System.out.println("[게시물 목록]");

    // 제네릭 문법에 따라 리턴 타입이 'Board[]' 이기 때문에
    // 따로 형변환 할 필요가 없다.
    // 대신 Board[] 배열을 리턴해 달라는 의미로 배열의 타입 정보를 넘긴다.
    Board[] boards = boardList.toArray(Board[].class);

    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          board.getNo(),
          board.getTitle(),
          board.getWriter(),
          board.getRegisteredDate(),
          board.getViewCount());
    }
  }
  
  public void detail() {
    System.out.println("[게시글 조회]");
    int no = Prompt.inputInt("번호? ");
    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글을 찾지 못했습니다.");
    } else {
      System.out.printf("제목: %s\n", board.getTitle());
      System.out.printf("내용: %s\n", board.getContent());
      System.out.printf("작성자: %s\n", board.getWriter());
    }
  }
  
  public void update() {
    System.out.println("[게시글 변경]");
    int no = Prompt.inputInt("번호? ");
    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글을 찾지 못했습니다.");
    } else {
      String title = Prompt.inputString(String.format("제목(%s)? ", board.getTitle()));
      String content = Prompt.inputString(String.format("내용(%s)? ", board.getContent()));
      String writer = Prompt.inputString(String.format("작성자(%s)? ", board.getWriter()));
      if (Prompt.inputString("정말 변경하시겠습니까?(y/N) ").equalsIgnoreCase("y")) {
        board.setTitle(title);
        board.setContent(content);
        board.setWriter(writer);
        System.out.println("게시글을 변경하였습니다.");
      } else {
        System.out.println("게시글 변경을 취소하였습니다.");
      }
    }
  }
  
  public void delete() {
    System.out.println("[게시글 삭제]");
    int no = Prompt.inputInt("번호? ");
    int index = indexOf(no);
    if (index == -1) {
      System.out.println("해당 번호의 게시글을 찾지 못했습니다.");
    } else {
      if(Prompt.inputString("정말 삭제하시겠습니까?(y/N) ").equalsIgnoreCase("y")) {
        boardList.remove(index);
        System.out.println("게시글을 삭제하였습니다.");
      } else {
        System.out.println("게시글 삭제를 취소하였습니다.");
      }
    }
  }

  private int indexOf(int no) {
    for (int i = 0; i < boardList.size(); i++) {
      if (boardList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }

  private Board findByNo(int no) {
    for (int i = 0; i < boardList.size(); i++) {
      if (boardList.get(i).getNo() == no) {
        return boardList.get(i);
      }
    }
    return null;
  }
}
