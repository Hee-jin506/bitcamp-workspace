package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  // 프로젝트 데이터
  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }
  static final int LENGTH = 100;  // PLENGTH 를 LENGTH 로 변경한다.
  static Project[] list = new Project[LENGTH]; // projects 를 list 로 변경한다.
  static int size = 0; // psize 를 size 로 변경한다.

  //다른 패키지에서 이 메서드를 사용할 수 있도록 public 으로 사용 범위를 공개한다.
  public static void add() {
    System.out.println("[프로젝트 등록]");
    
    Project project = new Project();
    project.no = Prompt.inputInt("번호? ");
    project.title = Prompt.inputString("프로젝트명? ");
    project.content = Prompt.inputString("내용? ");
    project.startDate = Prompt.inputDate("시작일? ");
    project.endDate = Prompt.inputDate("종료일? ");
    while (true) {
      String name = Prompt.inputString("만든이?(종료하려면 빈 문자열을 입력) ");
      if (name.length() == 0) {
        System.out.println("등록을 취소합니다.");
        return;
      }
      if (MemberHandler.findByName(name) != null) {
        project.owner = name;
        break;
      } 
      System.out.println("등록된 회원이 아닙니다.");
    }
    
    StringBuilder names = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원?(종료하려면 빈 문자열을 입력) ");
      if (name.length() == 0) {
        break;
      }
      if (MemberHandler.findByName(name) != null) {
        names.append(name + ",");
        project.members = names.toString();
      } else {
        System.out.println("등록된 회원이 아닙니다.");        
      }
    }

    list[size++] = project;
  }
  
  public static void list() {
    System.out.println("[프로젝트 목록]");
    
    for (int i = 0; i < size; i++) {
      Project project = list[i];
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          project.no, 
          project.title, 
          project.startDate, 
          project.endDate, 
          project.owner,
          project.members);
    }
  }
}
