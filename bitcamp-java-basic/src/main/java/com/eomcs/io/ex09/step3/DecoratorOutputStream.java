package com.eomcs.io.ex09.step3;

import java.io.IOException;
import java.io.OutputStream;

public abstract class DecoratorOutputStream extends OutputStream {
  
  OutputStream out;
  
  DecoratorOutputStream(OutputStream out) {
    this.out = out;
  }
  
  @Override
  public void write(int b) throws IOException {
    out.write(b);
  }
  
  @Override
  public void close() throws IOException {
    out.close();
  }

}
