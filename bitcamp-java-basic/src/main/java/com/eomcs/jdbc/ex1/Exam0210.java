package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0210 {
  
  public static void main(String[] args) {
    
    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb2",
        "study",
        "1111"); ) {
      
      System.out.println("DBMS와 연결됨!");
      
      System.out.println(con.getClass().getName());
      
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
