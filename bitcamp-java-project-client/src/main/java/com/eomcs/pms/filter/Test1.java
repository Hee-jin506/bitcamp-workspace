package com.eomcs.pms.filter;

import com.eomcs.pms.handler.Request;

class Filter1 implements CommandFilter {
  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    System.out.println("Filter1--> ");
    next.doFilter(request);
    System.out.println("<-- filter1");
  }
}
class Filter2 implements CommandFilter  {
  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    System.out.println("Filter1--> ");
    next.doFilter(request);
    System.out.println("<-- filter1");
  }
}
class Filter3 implements CommandFilter {
  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    System.out.println("Filter1--> ");
    System.out.println("<-- filter1");
  }
}

public class Test1 {
  public static void main(String[] args) {
    CommandFilterManager filterManager = new CommandFilterManager();
    filterManager.add(new Filter1());
    filterManager.add(new Filter2());
    filterManager.add(new Filter3());

  }
}

