package com.eomcs.net.ex12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
  
  ArrayList<PrintStream> outputStreams = new ArrayList<>();
  
  int port;
  
  public ChatServer(int port) {
    this.port = port;
  }
  
  public void service() {
    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("채팅 서버 시작!");
      
      while (true) {
        new Thread(new ChatAgent(serverSocket.accept())).start();
        System.out.println("채팅 클라이언트가 연결되었음!");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  class ChatAgent implements Runnable {
    Socket socket;
    
    public ChatAgent(Socket socket) {
      this.socket = socket;
    }
    
    @Override
    public void run() {
      try (Socket socket = this.socket;
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream())) {
        
        outputStreams.add(out);
        
        while (true) {
          String message = in.readLine();
          if (message.equals("quit"))
            break;
          
          new Thread(new MessageSender(message)).start();
        }
      } catch(Exception e) {
        e.printStackTrace();
      }
      System.out.println("채팅 클라이언트가 종료되었음!");
    }
  }
  
  class MessageSender implements Runnable {
    String message;
    
    public MessageSender(String message) {
      this.message = message;
    }
    
    @Override
    public void run() {
      send(message);
    }
  }
  
  synchronized private void send(String message) {
    for (PrintStream out : outputStreams) {
      try {
        out.println(message);
      } catch (Exception e) {
        outputStreams.remove(out);
      }
    }
  }
  
  public static void main(String[] args) {
    ChatServer chatServer = new ChatServer(8888);
    chatServer.service();
  }

}
