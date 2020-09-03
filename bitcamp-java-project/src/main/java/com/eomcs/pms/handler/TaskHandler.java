package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.AbstractList;
import com.eomcs.util.Prompt;

public class TaskHandler {

  //Task 객체 목록을 저장할 ArrayList 객체를 준비한다.
  // 제네릭 문법으로 항목의 타입을 지정한다.
  AbstractList<Task> taskList;
  MemberHandler memberHandler;

  public TaskHandler(MemberHandler memberHandler, AbstractList<Task> taskList) {
    this.memberHandler = memberHandler;
    this.taskList = taskList;
  }

  public void add() {
    System.out.println("[작업 등록]");

    Task task = new Task();
    task.setNo(Prompt.inputInt("번호? "));
    task.setContent(Prompt.inputString("내용? "));
    task.setDeadline(Prompt.inputDate("마감일? "));
    task.setStatus(Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> "));

    while (true) {
      String name = Prompt.inputString("담당자?(취소: 빈 문자열) ");

      if (name.length() == 0) {
        System.out.println("작업 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        task.setOwner(name);
        break;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }

    // 제네릭 문법에 따라 add()를 호출할 때 넘겨줄 수 있는 값은 
    // Task 또는 그 하위 타입의 인스턴스만 가능하다.
    // 다른 타입은 불가능하다.
    taskList.add(task);
  }

  public void list() {
    System.out.println("[작업 목록]");

    // 제네릭 문법에 따라 리턴 타입이 'Task[]' 이기 때문에
    // 따로 형변환 할 필요가 없다.
    // 대신 Task[] 배열을 리턴해 달라는 의미로 배열의 타입 정보를 넘긴다.
    Task[] tasks = taskList.toArray(new Task[] {});

    for (Task task : tasks) {
      String stateLabel = null;
      switch (task.getStatus()) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n",
          task.getNo(),
          task.getContent(),
          task.getDeadline(),
          stateLabel,
          task.getOwner());
    }
  }
  
  public void detail() {
    System.out.println("[작업 조회]");
    int no = Prompt.inputInt("번호? ");
    Task task = findByNo(no);
    if (task == null) {
      System.out.println("해당 번호의 작업을 찾지 못했습니다.");
    } else {
      System.out.printf("내용: %s\n", task.getContent());
      System.out.printf("마감일: %s\n", task.getDeadline());
      String stateLabel = null;
      switch (task.getStatus()) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("상태: %s\n", stateLabel);
      System.out.printf("담당자: %s\n", task.getOwner());
    }
  }
  
  public void update() {
    System.out.println("[작업 변경]");
    int no = Prompt.inputInt("번호? ");
    Task task = findByNo(no);
    if (task == null) {
      System.out.println("해당 번호의 작업을 찾지 못했습니다.");
    } else {
      String content = Prompt.inputString(String.format("내용(%s)? ", task.getContent()));
      Date deadline = Prompt.inputDate(String.format("종료일(%s)? ", task.getDeadline()));
      int status = Prompt.inputInt(String.format("상태(%s)? ", task.getStatus()));
      String name;
      while (true) {
        name = Prompt.inputString(String.format("담당자(%s)?(취소: 빈 문자열) ", task.getOwner()));
        if (name.length() == 0) {
          System.out.println("작업 변경을 취소합니다.");
          return;
        } else if (memberHandler.findByName(name) != null) {
          break;
        }
        System.out.println("등록된 회원이 아닙니다.");
      }
      if (Prompt.inputString("정말 변경하시겠습니까?(y/N) ").equalsIgnoreCase("y")) {
        task.setContent(content);
        task.setDeadline(deadline);
        task.setStatus(status);
        task.setOwner(name);
        System.out.println("작업을 변경하였습니다.");
      } else {
        System.out.println("작업 변경을 취소하였습니다.");
      }
    }
  }
  
  public void delete() {
    System.out.println("[프로젝트 삭제]");
    int no = Prompt.inputInt("번호? ");
    int index = indexOf(no);
    if (index == -1) {
      System.out.println("해당 번호의 프로젝트를 찾지 못했습니다.");
    } else {
      if(Prompt.inputString("정말 삭제하시겠습니까?(y/N) ").equalsIgnoreCase("y")) {
        taskList.remove(index);
        System.out.println("프로젝트를 삭제하였습니다.");
      } else {
        System.out.println("프로젝트 삭제를 취소하였습니다.");
      }
    }
  }

  private int indexOf(int no) {
    for (int i = 0; i < taskList.size(); i++) {
      if (taskList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }

  private Task findByNo(int no) {
    for (int i = 0; i < taskList.size(); i++) {
      if (taskList.get(i).getNo() == no) {
        return taskList.get(i);
      }
    }
    return null;
  }
}
