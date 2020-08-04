package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

    class Task {
      String project;
      int no;
      String content;
      Date endDate;
      String state;
      String worker;
    }

    final int LENGTH = 100;

    Task[] tasks = new Task[LENGTH];

    int count = 0;

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[작업]");

    for (int i = 0; i < LENGTH; i++) {
      count++;

      Task t = new Task();

      System.out.print("프로젝트? ");
      t.project = keyInput.nextLine();
      System.out.print("번호? ");
      String str = keyInput.nextLine();
      t.no = Integer.parseInt(str);
      System.out.print("내용? ");
      t.content = keyInput.nextLine();
      System.out.print("완료일? ");
      t.endDate = Date.valueOf(keyInput.nextLine());
      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      String num = keyInput.nextLine();
      switch (num) {
        case "0":
          t.state = "신규";
          break;
        case "1":
          t.state = "진행중";
          break;
        case "2":
          t.state = "완료";
          break;
      }
      System.out.print("담당자? ");
      t.worker = keyInput.nextLine();
      tasks[i] = t;

      System.out.println("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }

      System.out.println();



    }
    keyInput.close();

    System.out.println("----------------------");

    for (int i = 0; i < count; i++) {
      Task t = tasks[i];
      System.out.printf("%s, %d, %s, %s, %s, %s",
          t.project, t.no, t.content, t.endDate, t.state, t.worker);
    }
  }
}
