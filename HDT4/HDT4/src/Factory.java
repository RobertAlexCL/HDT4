
public class Factory {

    public AbstractStack SetType(String type){
        VectorStack vector = new VectorStack();
        if (type.equals("Vector")) {
            return new VectorStack<String>();
        } else if(type.equals("AL")){
            return new ArrayListStack<String>();
        } else if(type.equals("SList")){
            return new SingleLinkedList<String>();
        }else if (type.equals("DList")){
            return new DoubleLinkedList<String>();
        } else if (type.equals("CList")){
            return new CircularLinkedList<String>();
        } else return null;
    }
}
