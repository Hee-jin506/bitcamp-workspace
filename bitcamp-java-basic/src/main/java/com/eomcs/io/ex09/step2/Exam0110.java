// 데코레이터 패턴 적용 - 부품과 부품을 손쉽게 연결할 수 있다. 기능 확장 및 제거가 매우 쉽다.
package com.eomcs.io.ex09.step2;

import java.io.FileInputStream;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    
    FileInputStream in = new FileInputStream("temp/test4.data");
    
    BufferedInputStream in2 = new BufferedInputStream(in);
    
    DataInputStream in3 = new DataInputStream(in2);
    
    Member member = new Member();
    member.name = in3.readUTF();
    member.age = in3.readInt();
    member.gender = in3.readBoolean();
    
    in3.close();
    in2.close();
    in.close();
    
    System.out.println(member);

  }
}
