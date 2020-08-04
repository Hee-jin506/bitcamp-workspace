package com.eomcs.pms;

import java.sql.Date; // 클래스를 메모리로 가져오는게 아니고 클래스가 어느 패키지에 있는지
                      // 컴파일러에게 알려주는 것이다.

public class App2 {

  public static void main(String[] args) {
    class Project {
      int no;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String owner;
      String members;
    }



    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    // 여러개의 프로젝트 정보를 입력받기 위해 변수 준비
    final int LENGTH = 10;
    Project[] projects = new Project[LENGTH];

    int count = 0;

    System.out.println("[프로젝트]");

    for (int i = 0; i < LENGTH; i++) {
      count++;
      Project m = new Project();

      System.out.print("번호? ");
      m.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      m.title = keyInput.nextLine();
      System.out.print("내용? ");
      m.content = keyInput.nextLine();
      System.out.print("시작일? ");
      m.startDate = java.sql.Date.valueOf(keyInput.nextLine());
      System.out.print("종료일? ");
      m.endDate = java.sql.Date.valueOf(keyInput.nextLine());
      System.out.print("만든이? ");
      m.owner = keyInput.nextLine();
      System.out.print("팀원? ");
      m.members = keyInput.nextLine();

      projects[i] = m;

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }


    keyInput.close();

    System.out.println("---------------------------");

    for (int i = 0; i < count; i++) {
      Project m = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no, m.title, m.startDate, m.endDate, m.owner);
    }

  }
}
