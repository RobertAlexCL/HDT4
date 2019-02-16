
public class CircularLinkedList<E> extends AbstractList<E>{
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            super();
            this.element = element;
            this.next = next;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> tail = null;

    private int size = 0;

    @Override
    public void addFirst(E e) {
        if(size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        }else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }



    @Override
    public E removeFirst() {
        if(isEmpty()) return null;
        Node<E> head = tail.getNext();
        if(head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }



    @Override
    public int size() {

        return this.size;
    }
}
