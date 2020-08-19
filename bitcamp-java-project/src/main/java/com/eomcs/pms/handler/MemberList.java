package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;

public class MemberList {
  
  static final int DEFAULT_SIZE = 100;
  Member[] list; 
  int size = 0;
  
  public MemberList() {
    this(DEFAULT_SIZE);
  }
  
  public MemberList(int size) {
    if (size < DEFAULT_SIZE) {
      list = new Member[DEFAULT_SIZE];
    } else {
      list = new Member[size];
    }
  }
  
  public void add(Member member) {
    list[size++] = member;
  }
  
  public Member[] toArray() {
    Member[] arr = new Member[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
