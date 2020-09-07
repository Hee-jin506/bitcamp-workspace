package com.eomcs.util;

public interface List<E> {

  public abstract boolean add(E e);

  public /*abstract*/ void add(int index, E element);

  /*public*/ abstract E get(int index);

  E set(int index, E element);

  E remove(int index);

  Object[] toArray();

  E[] toArray(E[] arr);

  int size();
  
  Iterator<E> iterator();
}




