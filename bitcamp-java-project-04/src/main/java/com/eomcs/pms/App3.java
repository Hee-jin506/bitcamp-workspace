package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

    final int LENGTH = 100;

    String[] project = new String[LENGTH];
    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] state = new String[LENGTH];
    String[] worker = new String[LENGTH];

    int count = 0;

    Scanner keyInput = new Scanner(System.in);

    System.out.println("[작업]");

    for (int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("프로젝트? ");
      project[i] = keyInput.nextLine();
      System.out.print("번호? ");
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str);
      System.out.print("내용? ");
      content[i] = keyInput.nextLine();
      System.out.print("완료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());
      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      String num = keyInput.nextLine();
      switch (num) {
        case "0":
          state[i] = "신규";
          break;
        case "1":
          state[i] = "진행중";
          break;
        case "2":
          state[i] = "완료";
          break;
      }
      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();

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
      System.out.printf("%s, %d, %s, %s, %s, %s",
          project[i], no[i], content[i], endDate[i], state[i], worker[i]);
    }
  }
}
