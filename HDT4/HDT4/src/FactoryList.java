
public class FactoryList<E> {
    public AbstractList<E> SetType(String type){
        if (type.equals("SL")) {
            return new SingleLinkedList<>();
        }else if(type.equals("CL")){
            return new CircularLinkedList<>();
        }else if(type.equals("DL")){
            return new DoubleLinkedList<>();
        }
        return null;
    }
}