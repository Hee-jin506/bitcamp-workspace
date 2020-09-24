package com.eomcs.io.ex09.step3;

import java.io.OutputStream;

public class DataOutputStream extends DecoratorOutputStream {
  
  public DataOutputStream(OutputStream out) {
    super(out);
  }
  
  public void writeUTF(String str) throws Exception {
    byte[] bytes = str.getBytes("UTF-8");
    out.write(bytes.length);
    out.write(bytes);
  }

  public void writeInt(int value) throws Exception {
    // 실제 쓰기 작업은 이 객체와 연결된 부품을 통해 수행한다.
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }

  public void writeLong(long value) throws Exception {
    // 실제 쓰기 작업은 이 객체와 연결된 부품을 통해 수행한다.
    out.write((int) (value >> 56));
    out.write((int) (value >> 48));
    out.write((int) (value >> 40));
    out.write((int) (value >> 32));
    out.write((int) (value >> 24));
    out.write((int) (value >> 16));
    out.write((int) (value >> 8));
    out.write((int) value);
  }

  public void writeBoolean(boolean value) throws Exception {
    // 실제 쓰기 작업은 이 객체와 연결된 부품을 통해 수행한다.
    if (value)
      out.write(1);
    else
      out.write(0);
  }
}