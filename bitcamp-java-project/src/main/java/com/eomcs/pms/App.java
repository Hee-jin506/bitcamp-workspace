package com.eomcs.pms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberDetailCommand;
import com.eomcs.pms.handler.MemberListCommand;
import com.eomcs.pms.handler.MemberUpdateCommand;
import com.eomcs.pms.handler.ProjectAddCommand;
import com.eomcs.pms.handler.ProjectDeleteCommand;
import com.eomcs.pms.handler.ProjectDetailCommand;
import com.eomcs.pms.handler.ProjectListCommand;
import com.eomcs.pms.handler.ProjectUpdateCommand;
import com.eomcs.pms.handler.TaskAddCommand;
import com.eomcs.pms.handler.TaskDeleteCommand;
import com.eomcs.pms.handler.TaskDetailCommand;
import com.eomcs.pms.handler.TaskListCommand;
import com.eomcs.pms.handler.TaskUpdateCommand;
import com.eomcs.util.Prompt;

public class App {
  static List<Board> boardList = new ArrayList<>();
  static List<Member> memberList = new LinkedList<>();
  static List<Project> projectList = new LinkedList<>();
  
  static File boardFile = new File("./board.csv");
  static File memberFile = new File("./member.csv");
  static File projectFile = new File("./project.csv");
  static File taskFile = new File("./task.csv");
  static List<Task> taskList = new ArrayList<>();


  public static void main(String[] args) {
    
    loadBoards();
    loadMembers();
    loadProjects();
    loadTasks();
    
    // 파일에서 데이터를 읽어 List에 저장한다.

    // 커맨드 객체를 저장할 맵 객체를 준비한다.
    Map<String,Command> commandMap = new HashMap<>();

    // 맵 객체에 커맨드 객체를 보관한다.
    commandMap.put("/board/add", new BoardAddCommand(boardList));
    commandMap.put("/board/list", new BoardListCommand(boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(boardList));
    commandMap.put("/board/update", new BoardUpdateCommand(boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(boardList));

    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    commandMap.put("/member/add", new MemberAddCommand(memberList));
    commandMap.put("/member/list", memberListCommand);
    commandMap.put("/member/detail", new MemberDetailCommand(memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(memberList));
    commandMap.put("/member/delete", new MemberDeleteCommand(memberList));

    commandMap.put("/project/add", new ProjectAddCommand(projectList, memberListCommand));
    commandMap.put("/project/list", new ProjectListCommand(projectList));
    commandMap.put("/project/detail", new ProjectDetailCommand(projectList));
    commandMap.put("/project/update", new ProjectUpdateCommand(projectList, memberListCommand));
    commandMap.put("/project/delete", new ProjectDeleteCommand(projectList));

    commandMap.put("/task/add", new TaskAddCommand(taskList, memberListCommand));
    commandMap.put("/task/list", new TaskListCommand(taskList));
    commandMap.put("/task/detail", new TaskDetailCommand(taskList));
    commandMap.put("/task/update", new TaskUpdateCommand(taskList, memberListCommand));
    commandMap.put("/task/delete", new TaskDeleteCommand(taskList));

    commandMap.put("/hello", new HelloCommand());

    // 자바에서는 stack 알고리즘(LIFO)에 대한 인터페이스로 Deque 를 제공한다.
    Deque<String> commandStack = new ArrayDeque<>();

    // 자바에서 제공하는 LinkedList 클래스는 Queue 구현체이기도 하다.
    Queue<String> commandQueue = new LinkedList<>();

    loop:
      while (true) {
        String inputStr = Prompt.inputString("명령> ");

        if (inputStr.length() == 0) {
          continue;
        }

        // 사용자가 입력한 명령을 보관한다.
        commandStack.push(inputStr);
        commandQueue.offer(inputStr);

        switch (inputStr) {
          case "history": printCommandHistory(commandStack.iterator()); break;
          case "history2": printCommandHistory(commandQueue.iterator()); break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            Command command = commandMap.get(inputStr);
            if (command != null) {
              try {
                command.execute();
              
              } catch (Exception e) {
              System.out.printf("명령 처리 중 오류 발생: %s\n%s\n",
                  e.getClass().getName(),
                  e.getMessage());
              }
            } else {
              System.out.println("실행할 수 없는 명령입니다.");
            }
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
    
    saveBoards();
    saveMembers();
    saveProjects();
    saveTasks();
  }

  static void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        count++;

        // 5개 출력할 때 마다 계속 출력할지 묻는다.
        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
  
  public static void saveBoards() {
    System.out.println("[게시글 저장]");
    
    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(boardFile);
      
      // 각각 게시글 파일로 출력한다. 
      for (Board board : boardList) {
        
        out.write(board.toCSVString()); // 번호,제목,내용,작성자,작성일,조회수CRLF
      }
      
      // 파일 출력 도구 닫기
      // => 이 과정에서 파일 출력 도구의 임시 메모리(Buffer)에 잔류하는 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 중 오류 발생!");
    } finally {
      try {
        
        out.close();
      } catch (IOException e) {
//        close() 에서 오류가 발생할때는 마땅히 할 것이 없다.
//        그래서 그냥 무시
      }
    }
  }
  
  static void loadBoards() {
    System.out.println("[게시글 파일 로딩]");
    
    FileReader out = null;
    Scanner scanner = null;
    
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(boardFile);
      scanner = new Scanner(out);
      
      while (true) {
        try {
          String record = scanner.nextLine();
          
          // 객체를 list 목록에 추가한다.
          boardList.add(Board.valueOfCsv(record));
          
        } catch (NoSuchElementException e) {
          break;
        }
      }
      
    } catch (IOException e) {
      System.out.println("파일 읽기 중 오류 발생!");
    } finally {
      try {scanner.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
    }
  }
  

  

  public static void saveMembers() {
    System.out.println("[회원 저장]");
    
    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(memberFile);
      
      // 각각 게시글 파일로 출력한다. 
      for (Member member : memberList) {
        
        out.write(member.toCSVString()); 
      }
      
      // 파일 출력 도구 닫기
      // => 이 과정에서 파일 출력 도구의 임시 메모리(Buffer)에 잔류하는 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 중 오류 발생!");
    } finally {
      try {
        
        out.close();
      } catch (IOException e) {
//        close() 에서 오류가 발생할때는 마땅히 할 것이 없다.
//        그래서 그냥 무시
      }
      
    }
  }
  
  static void loadMembers() {
    System.out.println("[회원 파일 로딩]");
    
    FileReader out = null;
    Scanner scanner = null;
    
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(memberFile);
      scanner = new Scanner(out);
      
      while (true) {
        try {
          String record = scanner.nextLine();

          // 객체를 list 목록에 추가한다.
          memberList.add(Member.valueOfCsv(record));
          
        } catch (NoSuchElementException e) {
          break;
        }
      }
      
    } catch (IOException e) {
      System.out.println("파일 읽기 중 오류 발생!");
    } finally {
      try {scanner.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
    }
  }
  
  public static void saveProjects() {
    System.out.println("[프로젝트 저장]");
    
    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(projectFile);
      
      // 각각 게시글 파일로 출력한다. 
      for (Project project : projectList) {
        
        out.write(project.toCSVString()); 
       
      }
      
      // 파일 출력 도구 닫기
      // => 이 과정에서 파일 출력 도구의 임시 메모리(Buffer)에 잔류하는 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 중 오류 발생!");
    } finally {
      try {
        
        out.close();
      } catch (IOException e) {
//        close() 에서 오류가 발생할때는 마땅히 할 것이 없다.
//        그래서 그냥 무시
      }
      
    }
  }
  
  static void loadProjects() {
    System.out.println("[프로젝트 파일 로딩]");
    
    FileReader out = null;
    Scanner scanner = null;
    
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(projectFile);
      scanner = new Scanner(out);
      
      while (true) {
        try {
          String record = scanner.nextLine();
          
          // 객체를 list 목록에 추가한다.
          projectList.add(Project.valueOfCsv(record));
          
        } catch (NoSuchElementException e) {
          break;
        }
      }
      
    } catch (IOException e) {
      System.out.println("파일 읽기 중 오류 발생!");
    } finally {
      try {scanner.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
    }
  }
  
  public static void saveTasks() {
    System.out.println("[작업 저장]");
    
    FileWriter out = null;
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileWriter(taskFile);
      
      // 각각 게시글 파일로 출력한다. 
      for (Task task : taskList) {
        
        out.write(task.toCSVString()); 
      }
      
      // 파일 출력 도구 닫기
      // => 이 과정에서 파일 출력 도구의 임시 메모리(Buffer)에 잔류하는 데이터를 마무리로 완전히 출력한다.
    } catch (IOException e) {
      System.out.println("파일 출력 중 오류 발생!");
    } finally {
      try {
        
        out.close();
      } catch (IOException e) {
//        close() 에서 오류가 발생할때는 마땅히 할 것이 없다.
//        그래서 그냥 무시
      }
      
    }
  }
  
  static void loadTasks() {
    System.out.println("[작업 파일 로딩]");
    
    FileReader out = null;
    Scanner scanner = null;
    
    try {
      // 데이터를 파일에 출력할 때 사용할 도구
      out = new FileReader(taskFile);
      scanner = new Scanner(out);
      
      while (true) {
        try {
          String record = scanner.nextLine();
          
          // 객체를 list 목록에 추가한다.
          taskList.add(Task.valueOfCsv(record));
          
        } catch (NoSuchElementException e) {
          break;
        }
      }
      
    } catch (IOException e) {
      System.out.println("파일 읽기 중 오류 발생!");
//      e.printStackTrace();
    } finally {
      try {scanner.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
    }
  }
}
