package com.eomcs.oop.ex03;

public class Exam0162 {
  static class Member {
    public static final int GUEST = 0;
    public static final int MEMBER = 1;
    public static final int MANAGER = 2;
    
    String id;
    String password;
    int type;
    
  }

  public static void main(String[] args) {
    Member m4 = new Member();
    m4.id = "aaa";
    m4.password = "1111";
    m4.type = Member.GUEST;
    
    Member m5 = new  Member();
    m5.id = "aaa";
    m5.password = "1111";
    m5.type = Member.MANAGER;

    Member m6 = new Member();
    m6.id = "ccc";
    m6.password = "1111";
    m6.type = Member.MEMBER;
  }
}

