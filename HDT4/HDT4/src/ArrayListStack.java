
import java.util.ArrayList;


public class ArrayListStack<E> extends AbstractStack<E> {
    ArrayList<E> data;

    public ArrayListStack(){
        data = new ArrayList<E>();
    }
    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        return data.remove(size() - 1);
    }

    @Override
    public int size() {
        return data.size();
    }
}
