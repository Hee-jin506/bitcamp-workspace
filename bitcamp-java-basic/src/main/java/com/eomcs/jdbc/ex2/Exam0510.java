package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0510 {
  
  public static void main(String[] args) throws Exception {
    String title = null;
    String contents = null;
    ArrayList<String> files  = new ArrayList<>();
    try (Scanner keyScan = new Scanner(System.in)) {
      
      System.out.print("제목? ");
      title = keyScan.nextLine();
      
      System.out.print("내용? ");
      contents = keyScan.nextLine();
      
      while (true) {
        System.out.print("첨부파일:(완료는 그냥 엔터!)");
        String file = keyScan.nextLine();
        if (file.length() == 0) {
          break;
        }
        files.add(file);
      }
    }
    
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement boardStmt = con.prepareStatement("insert into x_board(title, contents) values(?,?)", Statement.RETURN_GENERATED_KEYS);
        PreparedStatement fileStmt = con.prepareStatement("insert into x_board_file(file_path, board_id) values(?,?)")) {

      con.setAutoCommit(false);
      
      boardStmt.setString(1, title);
      boardStmt.setString(2, contents);
      int count = boardStmt.executeUpdate();
      System.out.printf("%d 개 입력 성공!", count);
      
      ResultSet keyRS = boardStmt.getGeneratedKeys();
      keyRS.next();
      int boardId = keyRS.getInt(1);
      
      int fileCount = 0;
      for (String filename : files) {
        fileStmt.setString(1, filename);
        fileStmt.setInt(2, boardId);
        fileStmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d 개 첨부파일 입력 성공!", fileCount);
      
      con.commit();
    } catch (Exception e) {
      System.out.println("게시글 입력 중 오류 발생!");
      
      
    }
  }
}
