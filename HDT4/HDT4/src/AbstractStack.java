
abstract public class AbstractStack<E> implements iStack<E> {
    @Override
    public boolean empty() {
        return size()==0;
    }
}