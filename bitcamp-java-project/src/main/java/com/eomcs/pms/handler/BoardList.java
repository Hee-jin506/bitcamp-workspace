package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList {
  
  static final int DEFAULT_SIZE = 100;
  Board[] list = new Board[DEFAULT_SIZE]; // list로 이름을 바꾼다.
  int size = 0;
  
  public BoardList() {
    this(DEFAULT_SIZE);
  }
  
  public BoardList(int size) {
    if (size < DEFAULT_SIZE) {
      this.list = new Board[DEFAULT_SIZE];
    } else {
      this.list = new Board[size];
    }
  }
  
  public void add(Board board) {
    this.list[size++] = board;
  }
  
  public Board[] toArray() {
    Board[] arr = new Board[size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }
}
