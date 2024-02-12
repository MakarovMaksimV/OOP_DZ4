package impl;

import java.util.Iterator;

public class MyLinkeadList<E> implements MyLinkead<E> {
    private Node<E> first;
    private int size = 0;


    public E[] toArray() {
        int size = size();
        E[] result = null;
        result = (E[]) new Object[size];

        for (int i = 0; i < size; i++) {
            result[i] = getElementByIndex(i);
        }
        return result;
    }


    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element, null, first);

        if (first != null) {
            first.prev = newNode;
        }
        first = newNode;
        size++;
    }

    @Override
    public E getElementByIndex(int index) {
        if (index < 0 || index >= size || size == 0) {
            throw new IndexOutOfBoundsException("Индекс больше чем длина списка!");
        }
        Node<E> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.iteam;
    }

    @Override
    public int size() {
        return size;
    }
}
