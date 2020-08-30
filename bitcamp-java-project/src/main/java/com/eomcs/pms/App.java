package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {
  
  static BoardHandler boardHandler1 = new BoardHandler();
  static BoardHandler boardHandler2 = new BoardHandler();
  static MemberHandler memberHandler = new MemberHandler();
  static ProjectHandler projectHandler = new ProjectHandler(memberHandler);
  static TaskHandler taskHandler = new TaskHandler(memberHandler);
  
  public static void main(String[] args) {
    
    loop:
      while (true) {
        String answer = Prompt.promptString("명령> ");
        
        switch (answer) {
          case "/board1/add":
            boardHandler1.add();
            break;
          case "/board1/list":
            boardHandler1.list();
            break;
          case "/board2/add":
            boardHandler2.add();
            break;
          case "/board2/list":
            boardHandler2.list();
            break;
          case "/member/add":
            memberHandler.add();
            break;
          case "/member/list":
            memberHandler.list();
            break;
          case "/project/add":
            projectHandler.add();
            break;
          case "/project/list":
            projectHandler.list();
            break;
          case "/task/add":
            taskHandler.add();
            break;
          case "/task/list":
            taskHandler.list();
            break;
          case "exit":
            System.out.println("안녕!");
            break loop;
          default :
            System.out.println("실행할 수 없는 명령입니다.");
            break;
        }
        System.out.println(); // 빈 줄 출력
      }
    Prompt.getScanner().close();
  }
}
