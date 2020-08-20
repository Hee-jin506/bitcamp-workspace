package com.eomcs.pms;


import com.eomcs.pms.handler.TypeHandler;
import com.eomcs.util.Prompt;

// 1) `Prompt` 클래스를 별도의 패키지로 분류한다
// 2) 핸들러 클래스들을 별도의 패키지로 분류한다
public class App {
  
  

  public static void main(String[] args) {
    
    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
          case "멤버 종류 추가":
            TypeHandler.addMemberType();
            break;
          case "프로젝트 종류 추가":
            TypeHandler.addProjectType();
            break;
          case "게시판 추가":
            TypeHandler.addBoardType();
            break;
          case "작업 종류 추가":
            TypeHandler.addTaskType();
            break;
          case "/member/add":
            TypeHandler.mchoose().add();
            break;
          case "/member/list":
            TypeHandler.mchoose().list();
            break;
          case "/project/add":
            TypeHandler.pchoose().add();
            break;
          case "/project/list":
            TypeHandler.pchoose().list();
            break;
          case "/task/add":
            TypeHandler.tchoose().add();
            break;
          case "/task/list":
            TypeHandler.tchoose().list();
            break;
          case "/board/add":
            TypeHandler.bchoose().add();
            break;
          case "/board/list":
            TypeHandler.bchoose().list();
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
  
  

}
