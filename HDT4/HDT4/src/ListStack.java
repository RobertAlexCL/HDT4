
import java.awt.*;
import java.util.List;
import java.util.Stack;

public class ListStack<E> extends AbstractStack<E> {
    private AbstractList<E> list;
    private FactoryList<E> factory = new FactoryList<>();
    private String listType;

    public ListStack(String listType) {
        this.listType = listType;
       list = factory.SetType(listType);
       }

    @Override
    public void push(E item) {

        list.addFirst(item);
    }

    @Override
    public E pop() {


        if(listType.equals("DL")){
            return list.removeLast();
        }
        return list.removeFirst();

    }

    @Override
    public int size() {
        return list.size();

    }
}
