package com.eomcs.pms.handler;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskAddCommand implements Command {

  ProjectDao projectDao;
  TaskDao taskDao;

  public TaskAddCommand(TaskDao taskDao, ProjectDao projectDao) {
    this.projectDao = projectDao;
    this.taskDao = taskDao;
  }

  @Override
  public void execute(Map<String, Object> context) {
    System.out.println("[작업 등록]");

    // 작업 정보를 입력 받을 객체 준비
    Task task = new Task();

    try {

      List<Project> projects = projectDao.findAll();

      System.out.println("프로젝트들:");
      for (Project project : projects) {
        System.out.printf("  %d, %s\n",
            project.getNo(),
            project.getTitle());
      }

      if (projects.size() == 0) {
        System.out.println("프로젝트가 없습니다!");
        return;
      }

      // 사용자로부터 프로젝트 번호를 입력 받는다.
      loop :
      while (true) {
        int no = Prompt.inputInt("프로젝트 번호?(0: 취소) ");
        if (no == 0) {
          System.out.println("작업 등록을 취소합니다.");
          return;
        } 
        for (Project project : projects) {
          if (project.getNo() == no) {
            task.setProjectNo(no);
            break loop;
          }
        }
        System.out.println("프로젝트 번호가 맞지 않습니다.");
      }

      task.setContent(Prompt.inputString("내용? "));
      task.setDeadline(Prompt.inputDate("마감일? "));
      task.setStatus(Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> "));

      // 작업을 수행할 담당자를 결정한다.
      List<Member> members = projectDao.findByNo(task.getProjectNo()).getMembers();

      if (members.size() == 0) {
        System.out.println("멤버가 없습니다!");
        return;
      }

      // 사용자로부터 멤버 번호를 입력 받는다.
      loop2 :
      while (true) {
        int no = Prompt.inputInt("멤버 번호?(0: 취소) ");
        if (no == 0) {
          System.out.println("작업 등록을 취소합니다.");
          return;
        } else {
          for (Member member : members) {
            if (member.getNo()==no) {
              task.setOwner(member);
              break loop2;
            }
          }
          System.out.println("멤버 번호가 맞지 않습니다.");
        }
      }

      // 작업 정보를 입력한다.
      taskDao.insert(task);
      
      System.out.println("작업을 등록하였습니다.");

    } catch (Exception e) {
      System.out.println("작업 등록 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
