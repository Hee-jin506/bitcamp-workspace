package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// Stateful 통신
public class ClientApp {
  public static void main(String[] args) {
    // 서버주소: localhost
    // 서버포트: 8888
    
    try (Socket socket = new Socket("localhost", 8888);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream());) {
      
      out.println("안녕하세요?");
      out.flush();
      
      System.out.println(in.readLine());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
