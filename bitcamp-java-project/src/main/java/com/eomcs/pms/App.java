package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

// 1) `Prompt` 클래스를 별도의 패키지로 분류한다
// 2) 핸들러 클래스들을 별도의 패키지로 분류한다
public class App {
  
  static final int LENGTH = 100;
  static MemberHandler[] memberHandlers = new MemberHandler[LENGTH];
  static ProjectHandler[] projectHandlers = new ProjectHandler[LENGTH];
  static TaskHandler[] taskHandlers = new TaskHandler[LENGTH];
  static BoardHandler[] boardHandlers = new BoardHandler[LENGTH];
  static int msize, psize, tsize, bsize;

  public static void main(String[] args) {
    
    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
          case "멤버 종류 새로 추가":
            memberHandlers[msize++] = new MemberHandler(Prompt.inputString("새로 추가할 멤버 종류를 입력하세요. "));
            break;
          case "프로젝트 종류 새로 추가":
            String type = Prompt.inputString("새로 추가할 프로젝트 종류를 입력하세요. ");
            String member = Prompt.inputString("작성을 허가할 멤버 종류를 입력하세요. ");
            
            break;
          case "게시판 추가":
            break;
          case "작업 종류 새로 추가":
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
          case "/board/add":
            boardHandler.add();
            break;
          case "/board/list":
            boardHandler.list();
            break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
  }
  
  static MemberHandler mchoose(String type) {
    for (MemberHandler memberHandler : memberHandlers) {
      if (memberHandler.type.equals(type)) {
        return memberHandler;
      }
    }
    return null;
  }
}
