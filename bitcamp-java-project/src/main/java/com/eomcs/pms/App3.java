package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    
    final int MAX_LENGTH = 5;

    String[] project = new String[MAX_LENGTH];
    int[] no = new int[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] endDate = new Date[MAX_LENGTH];
    String[] state = new String[MAX_LENGTH];
    String[] worker = new String[MAX_LENGTH];
    
    int count = 0;
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      
      System.out.print("[작업]");
      System.out.print("프로젝트? ");
      project[i] = keyInput.nextLine();
      System.out.print("번호? ");
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str);
      System.out.print("내용? ");
      content[i] = keyInput.nextLine();
      System.out.print("완료일? ");
      endDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      // 조건문 
      
      System.out.print("> ");
      state[i] = keyInput.nextLine();
      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();
      
    }
    
    keyInput.close();
    
    System.out.println("----------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("프로젝트: %s", project[i]);
      System.out.printf("번호: %d", no[i]);
      System.out.printf("내용: %s", content[i]);
      System.out.printf("완료일: %s", endDate[i].toString);
      
    }
    
    switch (state) {
      case "0" :
        System.out.println("신규");
      case "1" :
        System.out.println("진행중");
      default :
        System.out.println("완료");
    }
    
  }
}
