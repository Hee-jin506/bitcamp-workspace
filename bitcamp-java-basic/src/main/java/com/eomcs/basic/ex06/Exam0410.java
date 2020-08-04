package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0410 {
  public static void main(String[] args) {
    ArrayList<String> scores = new ArrayList<String>();
    scores.add("오호라1!");
    scores.add("오호라2!");
    scores.add("오호라3!");
    scores.add("오호라4!");
    scores.add("오호라5!");


    for (Object value : scores) {
      System.out.println(value);
    }
  }
}
