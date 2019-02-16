
public class Factory<E> {

    public AbstractStack SetType(String type){
        VectorStack vector = new VectorStack();
        if (type.equals("Vector")) {
            return new VectorStack<E>();
        } else if(type.equals("AL")){

            return new ArrayListStack<E>();
        }
            return null;
        }}
