package com.eomcs.pms.handler;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskUpdateCommand implements Command {

  TaskDao taskDao;
  ProjectDao projectDao;

  public TaskUpdateCommand(TaskDao taskDao, ProjectDao projectDao) {
    this.taskDao = taskDao;
    this.projectDao = projectDao;
  }

  @Override
  public void execute(Map<String, Object> context) {

    try {
      System.out.println("[작업 변경]");
      int no = Prompt.inputInt("번호? ");
      Task task = taskDao.findByNo(no);

      if (task == null) {
        System.out.println("해당 번호의 작업이 존재하지 않습니다.");
        return;
      }

      // 프로젝트 변경
      System.out.printf("현재 프로젝트: %s\n", task.getProjectTitle());
      System.out.println("프로젝트들:");
      List<Project> projects = projectDao.findAll();
      for (Project project : projects) {
        System.out.printf("  %d, %s\n",
            project.getNo(),
            project.getTitle());
      }

      if (projects.size() == 0) {
        System.out.println("프로젝트가 없습니다!");
        return;
      }

      loop :
        while (true) {
          int projectNo = Prompt.inputInt("변경할 프로젝트 번호?(0: 취소) ");
          if (projectNo == 0) {
            System.out.println("작업 등록을 취소합니다.");
            return;
          } 
          for (Project project : projects) {
            if (project.getNo() == projectNo) {
              task.setProjectNo(projectNo);
              break loop;
            }
          }
          System.out.println("프로젝트 번호가 맞지 않습니다.");
        }

      // 작업 정보 변경
      task.setContent(Prompt.inputString(String.format(
          "내용(%s)? ", task.getContent())));
      task.setDeadline(Prompt.inputDate(String.format(
          "마감일(%s)? ", task.getDeadline())));

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
      task.setStatus(Prompt.inputInt(String.format(
          "상태(%s)?\n0: 신규\n1: 진행중\n2: 완료\n> ", stateLabel)));

      // 작업을 수행할 담당자를 결정한다.
      List<Member> members = projectDao.findByNo(task.getProjectNo()).getMembers();

      if (members.size() == 0) {
        System.out.println("멤버가 없습니다!");
        return;
      }

      // 사용자로부터 멤버 번호를 입력 받는다.
      loop2 :
        while (true) {
          int memberNo = Prompt.inputInt("멤버 번호?(0: 취소) ");
          if (memberNo == 0) {
            System.out.println("작업 등록을 취소합니다.");
            return;
          } else {
            for (Member member : members) {
              if (member.getNo()==memberNo) {
                task.setOwner(member);
                break loop2;
              }
            }
            System.out.println("멤버 번호가 맞지 않습니다.");
          }
        }


      String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
      if (!response.equalsIgnoreCase("y")) {
        System.out.println("작업 변경을 취소하였습니다.");
        return;
      }

      taskDao.update(task);

      if (taskDao.update(task) == 0) {
        System.out.println("해당 번호의 작업이 존재하지 않습니다.");
      } else {
        System.out.println("작업을 변경하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("작업 변경 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
