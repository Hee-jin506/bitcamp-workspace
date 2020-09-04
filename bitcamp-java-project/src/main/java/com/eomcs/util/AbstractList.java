package com.eomcs.util;

public abstract class AbstractList<E> implements List<E> {
  protected int size = 0;
  
  @Override
  public int size() {
    return this.size;
  }
  
  @Override
  public abstract boolean add(E e);
  
  @Override
  public abstract void add(int index, E element);
  
  @Override
  public abstract E get(int index);
  
  @Override
  public abstract E set(int index, E element);
  
  @Override
  public abstract E remove(int index);
  
  @Override
  public abstract Object[] toArray();
  
  @Override
  public abstract E[] toArray(E[] arr);
}
