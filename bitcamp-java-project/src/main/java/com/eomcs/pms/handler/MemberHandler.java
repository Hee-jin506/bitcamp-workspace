package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberHandler {
  
  private static final int LENGTH = 100;
  private Member[] list = new Member[LENGTH];
  private int size = 0;
  
  public void add() {
    Member m = new Member();
    System.out.println("[회원 추가]");
    m.no = Prompt.promptInt("번호? ");
    m.name = Prompt.promptString("이름? ");
    m.email = Prompt.promptString("이메일? ");
    m.password = Prompt.promptString("암호? ");
    m.photo = Prompt.promptString("사진? ");
    m.tel = Prompt.promptString("전화? ");
    m.registeredDate = new java.sql.Date(System.currentTimeMillis());
    
    list[size] = m;
    size++;
  }
  
  public void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      // 번호, 이름, 이메일, 전화, 가입일
      Member m = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }
  
  public Member findByName(String name) {
    for (int i = 0; i < size; i++) {
      if (list[i].name.equals(name)) {
        return list[i];
      }
    }
    return null;
  }
  
}
