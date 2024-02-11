package impl;

public interface MyLinkead<E> {
    void  addFirst(E element);
    void  addLast(E element);
    Node <E> getElementByIndex(int count);
    int size();

}
