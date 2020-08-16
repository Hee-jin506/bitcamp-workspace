package com.eomcs.corelib.ex02;

public class Exam0210 {
  public static void main(String[] args) {
    Byte b = new Byte((byte)100);
    Short s = new Short((short)20000);
    Integer i = new Integer(3000000);
    Long l = new Long(60000000000L);
    Float f = new Float(3.14f);
    Double d = new Double(3.14159);
    Boolean bool = new Boolean(true);
    Character c = new Character((char)0x41);
    
    Byte b2 = Byte.valueOf((byte)100);          
    Short s2 = Short.valueOf((short)20000);         
    Integer i2 = Integer.valueOf(3000000);          
    Long l2 = Long.valueOf(60000000000L);            
    Float f2 = Float.valueOf(3.14f);                 
    Double d2 = Double.valueOf(3.14159);            
    Boolean bool2 = Boolean.valueOf(true);           
    Character c2 = Character.valueOf((char)0x41);   
  }

}
