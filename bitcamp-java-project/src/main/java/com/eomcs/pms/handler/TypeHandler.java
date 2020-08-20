package com.eomcs.pms.handler;

import com.eomcs.util.Prompt;

public class TypeHandler {
  
  static final int LENGTH = 100;
  static MemberHandler[] memberHandlers = new MemberHandler[LENGTH];
  static ProjectHandler[] projectHandlers = new ProjectHandler[LENGTH];
  static TaskHandler[] taskHandlers = new TaskHandler[LENGTH];
  static BoardHandler[] boardHandlers = new BoardHandler[LENGTH];
  static int msize, psize, tsize, bsize;
  
  public static void addMemberType() {
    String type = Prompt.inputString("새로 추가할 멤버 종류를 입력하세요. ");
    memberHandlers[msize++] = new MemberHandler(type);
    System.out.printf("멤버 %s을(를) 추가했습니다.", type);
  }
  
  public static void addProjectType() {
    String type = Prompt.inputString("새로 추가할 프로젝트 종류를 입력하세요. ");
    System.out.print("작성을 허가할 ");
    projectHandlers[psize++] = new ProjectHandler(type, mchoose());
    System.out.printf("프로젝트 %s을(를) 추가했습니다.", type);
  }
  
  public static void addBoardType() {
    String type = Prompt.inputString("새로 추가할 게시판 종류를 입력하세요. ");
    System.out.print("작성을 허가할 ");
    boardHandlers[bsize++] = new BoardHandler(type, mchoose());
    System.out.printf("게시판 %s을(를) 추가했습니다.", type);
  }
  
  public static void addTaskType() {
    String type = Prompt.inputString("새로 추가할 작업 종류를 입력하세요. ");
    System.out.print("작성을 허가할 ");
    taskHandlers[tsize++] = new TaskHandler(type, mchoose());
    System.out.printf("작업 %s을(를) 추가했습니다.", type);
  }
  
  public static MemberHandler mchoose() {
    while (true) {
      System.out.println("멤버 종류를 입력하세요. ");
      list(memberHandlers, msize);
      String type = Prompt.inputString("");
      for (int i = 0; i < msize; i++) {
        if (memberHandlers[i].type.equals(type)) {
          return memberHandlers[i];
        }
      }
      System.out.println("등록된 멤버가 아닙니다.");
    }
  }
  

  public static ProjectHandler pchoose() {
    list(projectHandlers, psize);
    while (true) {
      String type = Prompt.inputString("프로젝트 종류를 입력하세요. ");
      for (int i = 0; i < psize; i++) {
        if (projectHandlers[i].type.equals(type)) {
          return projectHandlers[i];
        }
      }
      System.out.println("등록된 프로젝트가 아닙니다.");
    }
  }
  
  public static BoardHandler bchoose() {
    list(boardHandlers, bsize);
    while (true) {
      String type = Prompt.inputString("게시판 종류를 입력하세요. ");
      for (int i = 0; i < bsize; i++) {
        if (boardHandlers[i].type.equals(type)) {
          return boardHandlers[i];
        }
      }
      System.out.println("등록된 게시판이 아닙니다.");
    }
  }
  
  public static TaskHandler tchoose() {
    list(taskHandlers, tsize);
    while (true) {
      String type = Prompt.inputString("작업 종류를 입력하세요. ");
      for (int i = 0; i < tsize; i++) {
        if (taskHandlers[i].type.equals(type)) {
          return taskHandlers[i];
        }
      }
      System.out.println("등록된 게시판이 아닙니다.");
    }
  }
  
  public static void list(Object[] types, int size) {
    if (types.getClass().getSimpleName().equals("MemberHandler[]")) {
      System.out.println("[멤버 목록]");
      for (int i = 0; i < size; i++) {
        System.out.println(((MemberHandler[])types)[i].type);
      } 
    } else if (types.getClass().getSimpleName().equals("ProjectHandler[]")) {
      System.out.println("[프로젝트 목록]");
      for (int i = 0; i < size; i++) {
        System.out.println(((ProjectHandler[])types)[i].type);
      } 
    } else if (types.getClass().getSimpleName().equals("BoardHandler[]")) {
      System.out.println("[게시판 목록]");
      for (int i = 0; i < size; i++) {
        System.out.println(((BoardHandler[])types)[i].type);
      } 
    } else {
      System.out.println("[작업 목록]");
      for (int i = 0; i < size; i++) {
        System.out.println(((TaskHandler[])types)[i].type);
      }
    }
  }
}
