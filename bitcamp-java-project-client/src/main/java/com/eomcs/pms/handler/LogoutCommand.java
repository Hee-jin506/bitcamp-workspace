package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

public class LogoutCommand implements Command {

  @Override
  public void execute(Map<String, Object> context) {
    
    if (context.get("loginUser") == null) {
      System.out.println("로그인되지 않았습니다.");
      return;
    }
    System.out.printf("안녕히 가십쇼! %s님", ((Member)context.get("loginUser")).getName());
    context.remove("loginUser");
    
  }
}
