package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.AbstractList;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  //Project 객체 목록을 저장할 ArrayList 객체를 준비한다.
  // 제네릭 문법으로 항목의 타입을 지정한다.
  AbstractList<Project> projectList;
  MemberHandler memberHandler;

  public ProjectHandler(MemberHandler memberHandler, AbstractList<Project> projectList) {
    this.memberHandler = memberHandler;
    this.projectList = projectList;
  }

  public void add() {
    System.out.println("[프로젝트 등록]");

    Project project = new Project();
    project.setNo(Prompt.inputInt("번호? "));
    project.setTitle(Prompt.inputString("프로젝트명? "));
    project.setContent(Prompt.inputString("내용? "));
    project.setStartDate(Prompt.inputDate("시작일? "));
    project.setEndDate(Prompt.inputDate("종료일? "));

    while (true) {
      String name = Prompt.inputString("만든이?(취소: 빈 문자열) ");

      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        project.setOwner(name);
        break;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder members = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원?(완료: 빈 문자열) ");

      if (name.length() == 0) {
        break;
      } else if (memberHandler.findByName(name) != null) {
        if (members.length() > 0) {
          members.append(",");
        }
        members.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    project.setMembers(members.toString());

    // 제네릭 문법에 따라 add()를 호출할 때 넘겨줄 수 있는 값은 
    // Project 또는 그 하위 타입의 인스턴스만 가능하다.
    // 다른 타입은 불가능하다.
    projectList.add(project);
  }

  public void list() {
    System.out.println("[프로젝트 목록]");

    // 제네릭 문법에 따라 리턴 타입이 'Project[]' 이기 때문에
    // 따로 형변환 할 필요가 없다.
    // 대신 Project[] 배열을 리턴해 달라는 의미로 배열의 타입 정보를 넘긴다.
    Project[] projects = projectList.toArray(new Project[] {});

    for (Project project : projects) {
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          project.getNo(),
          project.getTitle(),
          project.getStartDate(),
          project.getEndDate(),
          project.getOwner(),
          project.getMembers());
    }
  }
  
  public void detail() {
    System.out.println("[프로젝트 조회]");
    int no = Prompt.inputInt("번호? ");
    Project project = findByNo(no);
    if (project == null) {
      System.out.println("해당 번호의 프로젝트를 찾지 못했습니다.");
    } else {
      System.out.printf("프로젝트명: %s\n", project.getTitle());
      System.out.printf("내용: %s\n", project.getContent());
      System.out.printf("시작일: %s\n", project.getStartDate());
      System.out.printf("종료일: %s\n", project.getEndDate());
      System.out.printf("만든이: %s\n", project.getOwner());
      System.out.printf("팀원: %s\n", project.getMembers());
    }
  }
  
  public void update() {
    System.out.println("[프로젝트 변경]");
    int no = Prompt.inputInt("번호? ");
    Project project = findByNo(no);
    if (project == null) {
      System.out.println("해당 번호의 프로젝트를 찾지 못했습니다.");
    } else {
      String title = Prompt.inputString(String.format("프로젝트명(%s)? ", project.getTitle()));
      String content = Prompt.inputString(String.format("내용(%s)? ", project.getContent()));
      Date startDate = Prompt.inputDate(String.format("시작일(%s)? ", project.getStartDate()));
      Date endDate = Prompt.inputDate(String.format("종료일(%s)? ", project.getEndDate()));
      String name;
      while (true) {
        name = Prompt.inputString(String.format("만든이(%s)?(취소: 빈 문자열) ", project.getOwner()));
        if (name.length() == 0) {
          System.out.println("프로젝트 변경을 취소합니다.");
          return;
        } else if (memberHandler.findByName(name) != null) {
          break;
        }

        System.out.println("등록된 회원이 아닙니다.");
      }
      StringBuilder members = new StringBuilder();
      while (true) {
        String teamMember = Prompt.inputString(String.format("팀원?(완료: 빈 문자열) ", project.getMembers()));

        if (teamMember.length() == 0) {
          break;
        } else if (memberHandler.findByName(teamMember) != null) {
          if (members.length() > 0) {
            members.append(",");
          }
          members.append(teamMember);
        } else {
          System.out.println("등록된 회원이 아닙니다.");
        }
      }
      if (Prompt.inputString("정말 변경하시겠습니까?(y/N) ").equalsIgnoreCase("y")) {
        project.setTitle(title);
        project.setContent(content);
        project.setStartDate(startDate);
        project.setEndDate(endDate);
        project.setOwner(name);
        project.setMembers(members.toString());
        System.out.println("프로젝트를 변경하였습니다.");
      } else {
        System.out.println("프로젝트 변경을 취소하였습니다.");
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
        projectList.remove(index);
        System.out.println("프로젝트를 삭제하였습니다.");
      } else {
        System.out.println("프로젝트 삭제를 취소하였습니다.");
      }
    }
  }

  private int indexOf(int no) {
    for (int i = 0; i < projectList.size(); i++) {
      if (projectList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }

  private Project findByNo(int no) {
    for (int i = 0; i < projectList.size(); i++) {
      if (projectList.get(i).getNo() == no) {
        return projectList.get(i);
      }
    }
    return null;
  }
}
