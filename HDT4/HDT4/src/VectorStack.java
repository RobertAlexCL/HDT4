
import java.util.Vector;

public class VectorStack<E> extends AbstractStack<E> {
    Vector<E> data;

    public  VectorStack(){
        data = new Vector<E>();
    }
    @Override
    public void push(E item) {
        data.add(item);
    }

    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    @Override
    public int size() {
        return data.size();
    }
}
