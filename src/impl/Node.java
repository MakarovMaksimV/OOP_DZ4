package impl;

public class Node <E> {
    public E iteam;
    public Node<E> next;
    public Node<E> prev;

    public Node(E iteam,Node <E> prev,Node<E> next){
        this.iteam = iteam;
        this.next = next;
    }
}
