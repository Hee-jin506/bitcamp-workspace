package com.eomcs.jeongseok.ch7;

import java.awt.Button;
import java.awt.event.ActionEvent;

public class InnerEx8 {
  public static void main(String[] args) {
    Button b = new Button("Start");
    b.addActionListener(new EventHandler() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent ocurred!");
      }
    }
    );
  }
}
