
public interface iStack<E> {

    public void push(E item);
    // post: el item es agregado al stack. Sera
    //       el proximo en salir

    public E pop();
    // pre: stack no esta vacio
    // post: el elemento ingresado mas recientemente
    //       es retirado.


    public boolean empty();
    //post: regresa true si el stack esta vacio

    public int size();
    //post: regresa la cantidad de elementos
    //      en el stack
}
