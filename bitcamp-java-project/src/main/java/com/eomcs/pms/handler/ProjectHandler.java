package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectHandler {
  
  private static final int LENGTH = 100;
  private Project[] list = new Project[LENGTH];
  private int size = 0;
  private MemberHandler memberHandler;
  
  public ProjectHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }
  
  public void add() {
    Project p = new Project();
    System.out.println("[프로젝트 추가]");
    p.no = Prompt.promptInt("번호? ");
    p.title = Prompt.promptString("프로젝트명? ");
    p.content = Prompt.promptString("내용? ");
    p.startDate = Prompt.promptDate("시작일? ");
    p.endDate = Prompt.promptDate("종료일? ");
    while (true) {
      String name = Prompt.promptString("만든이?(취소: 빈 문자열) ");
      if (name.length() == 0) {
        return;
      }
      if (memberHandler.findByName(name) == null) {
        System.out.println("등록된 회원이 아닙니다.");
      } else {
        p.owner = name;
        break;
      }
    }
    while (true) {
      String name = Prompt.promptString("팀원?(완료: 빈문자열) ");
      if (name.length() == 0) {
        break;
      }
      if (memberHandler.findByName(name) == null) {
        System.out.println("등록된 회원이 아닙니다.");
      } else {
        p.members += name + ", ";
      }
    }
    
    list[size] = p;
    size++;
  }
  
  public void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < size; i++) {
      Project p = list[i];
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner, p.members);
    }
  }
}
