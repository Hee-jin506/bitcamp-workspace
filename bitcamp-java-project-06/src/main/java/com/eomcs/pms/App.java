package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

// 1) 회원 데이터를 입력하는 코드를 메서드로 분리한다.
// 2) 회원 데이터 목록을 출력하는 코드를 메서드로 분리한다.
// 3) 프로젝트 데이터를 입력하는 코드를 메서드로 분리한다.
// 4) 프로젝트 데이터 목록을 출력하는 코드를 메서드로 분리한다.
// 5) 작업 데이터를 입력하는 코드를 메서드로 분리한다.
// 6) 작업 데이터 목록을 출력하는 코드를 메서드로 분리한다.
public class App {
  static Scanner keyInput = new Scanner(System.in);

  //회원
  static final int LENGTH = 5;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] now = new Date[LENGTH];
  static int count = 0;

//프로젝트
  static final int PLENGTH = 10;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];
  static int pcount = 0;

//작업
  static final int TLENGTH = 100;

  static String[] tproject = new String[LENGTH];
  static int[] tno = new int[LENGTH];
  static String[] tcontent = new String[LENGTH];
  static Date[] tendDate = new Date[LENGTH];
  static String[] tstate = new String[LENGTH];
  static String[] tworker = new String[LENGTH];
  static int tcount = 0;

  public static void main(String[] args) {

    loop:
      while (true) {
        String command = promptString("명령> ");

        switch (command.toLowerCase()) {
          case "/member/add" :
            addMember(); // addMember()에 따로 빼낸 코드를 실행하라
            // 이것을 메서드 호출이라 한다.
            break;
          case "/member/list" :
            listMember();
            break;
          case "/project/add" :
            addProject();
            break;
          case "/project/list" :
            listProject();
            break;
          case "/task/add" :
            addTask();
            break;
          case "/task/list" :
            listTask();
            break;
          case "exit" :
          case "quit" :
            System.out.println("안녕!");
            break loop;
          default :
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println();

    }
    keyInput.close();
    System.out.println("종료!");

  }


  static void addMember() {
    System.out.println("[회원 등록]");

    no[count] = promptInt("번호? ");
    name[count] = promptString("이름? ");
    email[count] = promptString("이메일? ");;
    password[count] = promptString("암호? ");;
    photo[count] = promptString("사진? ");
    tel[count] = promptString("전화? ");
    now[count] = new Date(System.currentTimeMillis());
    count++;
  }

  static void listMember() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], name[i], email[i], tel[i], now[i].toString());
    }
  }

  static void addProject() {
    System.out.println("[프로젝트 등록]");


    pno[pcount] = promptInt("번호? ");
    ptitle[pcount] = promptString("프로젝트명? ");
    pcontent[pcount] = promptString("내용? ");
    pstartDate[pcount] =promptDate("시작일? ");
    pendDate[pcount] = promptDate("종료일? ");
    powner[pcount] = promptString("만든이? ");
    pmembers[pcount] = promptString("팀원? ");
    pcount++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
      }
  }


  static void addTask() {
    System.out.println("[프로젝트 등록]");

    tproject[tcount] = promptString("프로젝트? ");
    tno[tcount] = promptInt("번호? ");
    tcontent[tcount] = promptString("내용? ");
    tendDate[tcount] = promptDate("완료일? ");
    switch (promptString("상태? \n0: 신규\n1: 진행중\n2: 완료\n> ")) {
      case "0":
        tstate[tcount] = "신규";
        break;
      case "1":
        tstate[tcount] = "진행중";
        break;
      case "2":
        tstate[tcount] = "완료";
        break;
    }

    tworker[tcount] = promptString("담당자? ");
    tcount++;
  }

  static void listTask() {
    System.out.println("[작업 목록]");
    for (int i = 0; i < tcount; i++) {
      System.out.printf("%s, %d, %s, %s, %s, %s\n",
          tproject[i], tno[i], tcontent[i], tendDate[i], tstate[i], tworker[i]);
    }
  }

  static String promptString(String title) {
    System.out.print(title);
    return keyInput.nextLine();
  }

  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }

  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }

}