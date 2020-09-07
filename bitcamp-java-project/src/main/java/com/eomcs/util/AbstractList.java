package com.eomcs.util;

import java.util.NoSuchElementException;

public abstract class AbstractList<E> implements List<E>{

  protected int size;

  @Override
  public int size() {
    return size;
  }
  
  @Override
  public Iterator<E> iterator() {
    return new ListIterator<E>(this);
  }
  
  private static class ListIterator<E> implements Iterator<E> {
    
    private List<E> list;
    private int cursor;
    
    public ListIterator(List<E> list) {
      this.list = list;
    }
    
    @Override
    public boolean hasNext() {
      return cursor < list.size();
    }

    @Override
    public E next() {
      if (cursor == list.size()) {
        throw new NoSuchElementException();
      }
      return list.get(cursor++);
    }
  }

}
