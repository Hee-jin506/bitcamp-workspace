package com.eomcs.net.ex11.step11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class RequestProcessor {

  Socket socket;

  public Socket getSocket() {
    return socket;
  }

  public void setSocket(Socket socket) {
    this.socket = socket;
  }

  public RequestProcessor(Socket socket) {
    this.socket = socket;
  }

  public RequestProcessor() {

  }

  public void service() throws Exception {
    try (Socket socket = this.socket;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());) {

      sendResponse(out, compute(in.readLine())); // 클라리언트에게 응답한다.

    }
  }

  private String compute(String request) {
    try {
      String[] values = request.split(" ");

      int a = Integer.parseInt(values[0]);
      String op = values[1];
      int b = Integer.parseInt(values[2]);
      int result = 0;

      switch (op) {
        case "+": result = a + b; break;
        case "-": result = a - b; break;
        case "*": result = a * b; break;
        case "/": result = a / b; break;
        default:
          return String.format("%s 연산자를 지원하지 않습니다.", op);
      }
      return String.format("결과는 %d %s %d = %d 입니다.", a, op, b, result);

    } catch (Exception e) {
      return String.format("계산 중 오류 발생! - %s", e.getMessage());
    }
  }

  private void sendResponse(PrintStream out, String message) {
    out.println(message);
    out.println();
    out.flush();
  }
}
