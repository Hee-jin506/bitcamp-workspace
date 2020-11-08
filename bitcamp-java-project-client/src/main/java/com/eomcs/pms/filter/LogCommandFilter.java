package com.eomcs.pms.filter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import com.eomcs.pms.handler.Request;

public class LogCommandFilter implements CommandFilter {
  
  PrintWriter logOut;
  
  public LogCommandFilter(File file) throws Exception {
    logOut = new PrintWriter(new FileOutputStream(file));
  }

  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    logOut.println(request.getCommandPath());
    logOut.flush();
    next.doFilter(request);
  }
  
  @Override
  public void destroy() {
      logOut.close();
  }
}
