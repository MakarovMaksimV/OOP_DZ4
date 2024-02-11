package impl;

public class Node <E> {
    private E element;
    private Node <E> next;
    private Node <E> prev;

    public Node(E element, Node<E> next, Node<E> prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public void setElement(E element){
        this.element = element;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNextElement() {
        return (Node<E>) next.element; //
    }

    public E getElement() {
        return element;
    }
}

