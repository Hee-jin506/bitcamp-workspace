package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskHandler {
  
  private static final int LENGTH = 100;
  private Task[] list = new Task[LENGTH];
  private int size = 0;
  private MemberHandler memberHandler;
  
  public TaskHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }
  
  public void add() {
    Task t = new Task();
    System.out.println("[작업 추가]");
    t.no = Prompt.promptInt("번호? ");
    t.content = Prompt.promptString("내용? ");
    t.deadline = Prompt.promptDate("마감일? ");
    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    t.status = Prompt.promptInt("> ");
    while (true) {
      String name = Prompt.promptString("담당자?(취소: 빈 문자열) ");
      if (name.length() == 0) {
        return;
      }
      if (memberHandler.findByName(name) == null) {
        System.out.println("등록된 회원이 아닙니다.");
      } else {
        t.owner = name;
        break;
      }
    }
    list[size] = t;
    size++;
  }
  
  public void list() {
    System.out.println("[작업 목록]");
    for (int i = 0; i < size; i++) {
      Task t = list[i];
      String stateLabel = null;
      switch (t.status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          t.no, t.content, t.deadline, stateLabel, t.owner);
    }
  }
}
