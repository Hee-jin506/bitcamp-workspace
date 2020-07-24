package com.eomcs.pms;

//1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
//2) 조건문을 사용하여 입출력 제어하기
//- 필요한 만큼만 입력받고 출력하고 싶다.
//3) 배열을 사용하여 여러 개의 값을 다루기
//- 배열을 사용하면 간단하게 여러개의 변수를 선언할 수 있다.
//4) 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
//5) 배열 개수를 변수에서 관리하기
//- 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있어 편하다.
//6) 상수를 사용하여 초기값을 변경하지 못하게 막기
//- 변수는 중간에 값을 바꿀 수 있기 때문에 값을 바꾸지 말아야하는 경우
//상수로 선언
import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    
    final int MAX_LENGTH = 5;
    int[] no = new int[MAX_LENGTH];
    String[] title = new String[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] startDate = new Date[MAX_LENGTH];
    Date[] endDate = new Date[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];
    String[] team = new String[MAX_LENGTH];
    
    int count = 0;
    
    System.out.println("[프로젝트]");
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    for (int i = 0; i < MAX_LENGTH; i++) {
      count++;
      
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      System.out.print("프로젝트명? ");
      title[i] = keyInput.nextLine();
      System.out.print("내용? ");
      content[i] = keyInput.nextLine();
      System.out.print("시작일? ");
      startDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
      System.out.print("종료일? ");
      endDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
      System.out.print("만든이? ");
      owner[i] = keyInput.nextLine();
      System.out.print("팀원? ");
      team[i] = keyInput.nextLine();
      
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break;
      }
    }
    
    
    keyInput.close();
    
    System.out.println("---------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s",
          no[i], title[i], content[i],startDate[i],endDate[i], owner[i], team[i]);
    }
  }
}
