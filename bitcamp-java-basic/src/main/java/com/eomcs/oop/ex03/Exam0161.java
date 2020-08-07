package com.eomcs.oop.ex03;

public class Exam0161 {
  static class Member {
    String id;
    String password;
    int type;
  }
  
  public static void main(String[] args) {
    final int GUEST = 0;
    final int MEMBER = 1;
    final int MANAGER = 2;
    
    Member m4 = new Member();
    m4.id = "aaa";
    m4.password = "1111";
    m4.type = GUEST;
    
    Member m5 = new Member();
    m5.id = "bbb";
    m5.password = "1111";
    m5.type = MANAGER;
    
    Member m6 = new Member();
    m6.id = "ccc";
    m6.password = "1111";
    m6.type = MEMBER;
  }

}
