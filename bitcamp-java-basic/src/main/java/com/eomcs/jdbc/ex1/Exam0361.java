package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0361 {
  
  public static void main(String[] args) {
        try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
         java.sql.Statement stmt = con.createStatement();) {
      // 부모 테이블의 데이터를 지우려면
      // 자식 테이블의 데이터를 먼저 지워야 한다.
      int count = stmt.executeUpdate(
          "delete from x_board_file where board_id = 4");
      count = stmt.executeUpdate(
          "delete from x_board where board_id = 4");
      System.out.printf("%d 개 삭제 성공!", count);

    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
