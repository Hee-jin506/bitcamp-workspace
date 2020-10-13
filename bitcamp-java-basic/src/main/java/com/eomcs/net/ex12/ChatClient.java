package com.eomcs.net.ex12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ChatClient extends Frame implements ActionListener {
  private static final long serialVersionUID = 1L;
  
  TextField addressTF = new TextField(20);
  TextField portTF = new TextField(4);
  Button connectBtn = new Button("연결");
  TextArea chattingPane = new TextArea();
  TextField messageTF = new TextField();
  Button sendBtn = new Button("보내기");
  
  Socket socket;
  BufferedReader in;
  PrintStream out;
  
  public ChatClient(String title) {
    super(title);
    this.setSize(600, 480);
    
    this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        try {
          in.close();
        } catch (Exception ex) {
        }
        try {
          out.close();
        } catch (Exception ex) {
        }
        try {
          socket.close();
        } catch (Exception ex) {
        }
        System.exit(0);
      }
    });
    
    Panel topPane = new Panel();
    topPane.add(addressTF);
    topPane.add(portTF);
    topPane.add(connectBtn);
    this.add(topPane, BorderLayout.NORTH);
    
    this.add(chattingPane, BorderLayout.CENTER);
    
    Panel bottomPane = new Panel();
    bottomPane.setLayout(new BorderLayout());
    bottomPane.add(messageTF, BorderLayout.CENTER);
    bottomPane.add(sendBtn, BorderLayout.EAST);
    
    this.add(bottomPane, BorderLayout.SOUTH);
    
    connectBtn.addActionListener(this);
    sendBtn.addActionListener(this);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == sendBtn) {
      out.println(messageTF.getText());
      
      messageTF.setText("");
      
    } else if (e.getSource() == connectBtn) {
      connectChatServer();
    }
  }
  
  private void connectChatServer() {
    try {
      socket = new Socket(addressTF.getText(), Integer.parseInt(portTF.getText()));
      out = new PrintStream(socket.getOutputStream());
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      
      chattingPane.append("서버와 연결됨!\n");
      
      new Thread(new MessageReceiver()).start();
    } catch (Exception e) {
      chattingPane.append("서버 연결 오류!\n");
      
    }
  }
  
  class MessageReceiver implements Runnable {
    @Override
    public void run() {
      try {
        while (true) {
          String message = in.readLine();
          chattingPane.append(message + "\n");
        }
      } catch (Exception e) {
        chattingPane.append("메시지 수신 중 오류 발생!\n");
      }
    }
  }
  
  public static void main(String[] args) {
    ChatClient app = new ChatClient("비트 채팅!");
    app.setVisible(true);
  }

}
