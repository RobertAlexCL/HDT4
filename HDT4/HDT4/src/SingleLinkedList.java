
public class SingleLinkedList<E> extends AbstractList<E> {
    private static class Node<E>{
        private E element; //Valor
        private Node<E> next; //Puntero en la lista
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


    private Node<E> head = null;
    private Node<E> tail = null;

    private int size = 0;


    @Override
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) tail = head;
        size++;
    }



    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E response = head.getElement();
        head = head.getNext( );
        size--;
        if(size == 0) tail = null;
        return response;
    }



    @Override
    public int size() {
        return this.size;
    }
}
