package com.eomcs.basic.ex03;

public class Exam0700 {
  public static void main(String[] args) {
    // \n - Line Feed(LF), 0x0a
    // \r - Carrage Return(CR), 0x0d 
    // \f - Form Feed, 0x0c
    // \t - Tab, 0x09
    // \b - Backspace, 0x08
    // \' - Single Quote, 0x27
    // \" - Double Quote, 0x22
    // \\ - Backslash, 0x5c
    
    System.out.println("Hello, world");
    System.out.println("Hello, \nworld");
    System.out.println("Hello. \rabc");
    System.out.println("Hello,\b\b\bworld");
    System.out.println("Hello,\fworld");
    System.out.println("Hello, \"w\"orld");
    System.out.println('\'');
    System.out.println('"');
    System.out.println("c:\\Users\\user\\git");
    
   
//    Hello, world
//    Hello,
//    world
//    abclo.
//    Helworld
//    Hello,
//          world
//    Hello, "w"orld
//    '
//    "
  }

}
