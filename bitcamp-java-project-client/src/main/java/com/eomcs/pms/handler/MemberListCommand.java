package com.eomcs.pms.handler;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import com.eomcs.pms.domain.Member;

public class MemberListCommand implements Command {

  List<Member> memberList;

  public MemberListCommand(List<Member> list) {
    this.memberList = list;
  }

  @Override
  public void execute() {
    System.out.println("[회원 목록]");

    try (java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement(
            "select no, name, email, password, photo, tel, cdt"
            + " from pms_member"
            + " order by no desc");
        java.sql.ResultSet rs = stmt.executeQuery()) {
      
      System.out.println("번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일");
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n",
            rs.getInt("no"),
            rs.getString("name"),
            rs.getString("email"),
            rs.getString("password"),
            rs.getString("photo"),
            rs.getString("tel"),
            rs.getDate("cdt"));
      }
    } catch (Exception e) {
      System.out.println("데이터 목록 조회 중 오류 발생!");
      e.printStackTrace();
    } 
  }

}
