
import java.awt.*;

public class DoubleLinkedList<E> extends AbstractList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }
    @Override
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }


    @Override
    public E removeFirst() {
        if (isEmpty())
            return null;
        return remove(header.getNext());
    }


    @Override
    public int size() {
        return this.size;
    }

    private Node<E> header = null;//Referencia
    private Node<E> trailer = null;
    private int size = 0;
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    public DoubleLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev( );
        Node<E> successor = node.getNext( );
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement( );
    }
}
