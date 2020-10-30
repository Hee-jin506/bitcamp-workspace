package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0350 {
  
  public static void main(String[] args) throws Exception {
    String num = null;
    
    try (Scanner keyScan = new Scanner(System.in)) {
      
      System.out.print("번호? ");
      num = keyScan.nextLine();
      
      System.out.print("삭제하시겠습니까?(Y/n) ");
      String input = keyScan.nextLine();
      
      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소 하였습니다.");
        return;
      }
    }
    
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt1 = con.prepareStatement("delete from x_board_file where board_id=?");
        PreparedStatement stmt2 = con.prepareStatement("delete from x_board where board_id=?");) {
      
      stmt1.setString(1, num);
      stmt2.setString(1, num);
      
      stmt1.executeUpdate();
      int count = stmt2.executeUpdate();
      
      if (count == 0) {
        System.out.println("해당 게시물이 존재하지 않습니다.");
      } else {
        System.out.printf("삭제하였습니다.");
      }
    }
  }
}
