package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

public class WhoAmICommand implements Command {

  @Override
  public void execute(Map<String, Object> context) {
    Member loginUser = (Member) context.get("loginUser");
    if (loginUser == null) {
      System.out.println("로그인 하지 않았습니다.");
      return;
    }
    
    System.out.printf("이름: %s\n", loginUser.getName());
    System.out.printf("이메일: %s\n", loginUser.getEmail());
    System.out.printf("사진: %s\n", loginUser.getPhoto());
    System.out.printf("전화: %s\n", loginUser.getTel());
    System.out.printf("등록일: %s\n", loginUser.getRegisteredDate());

    
  }

}
