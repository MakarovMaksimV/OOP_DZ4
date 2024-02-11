package impl;

import java.util.Iterator;

public class MyLinkeadList<E> implements MyLinkead<E> {
    private Node <E> headFirst;
    private Node <E> headLast;
    private  int size;

    private Node<E> getNextElement(Node<E> element){
        return element.getNextElement();
    }

    public MyLinkeadList() {
        headFirst = new Node<>(null,null,headLast);
        headLast = new Node<>(null,headFirst,null);
    }

    @Override
    public void addFirst(E element) {
        Node<E> next = headFirst;
        next.setElement(element);
        headFirst = new Node<>(null,null,next);
        next.setPrev(headFirst);
        size++;
    }

    @Override
    public void addLast(E element) {
        Node <E> prev = headLast;
        prev.setElement(element);
        headLast = new Node<>(null,prev,null);
        prev.setNext(headLast);
        size++;
    }

    @Override
    public Node <E> getElementByIndex(int index) {
        if(index > size & size == 0){
            throw new IndexOutOfBoundsException("Индекс больше чем длина списка!");
        }
        Node<E> result = headFirst.getNextElement();
        for (int i = 0; i< index; i++){
            result = getNextElement(result);
        }
        return (Node<E>) result.getElement();
    }

    @Override
    public int size() {
        return size;
    }
}
