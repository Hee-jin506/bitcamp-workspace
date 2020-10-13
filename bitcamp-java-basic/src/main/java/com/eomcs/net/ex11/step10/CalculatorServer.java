// 계산기 서버 만들기 - 8단계: 예외 처리 추가
package com.eomcs.net.ex11.step10;

import java.net.ServerSocket;

public class CalculatorServer {
  public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");

      RequestProcessor requestProcessor = new RequestProcessor();
      while (true) {
        requestProcessor.setSocket(serverSocket.accept());
        requestProcessor.service();
        
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
