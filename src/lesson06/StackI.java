package lesson06;

public interface StackI<E> {

    E push(E obj);
    E peek();
    E pop();
    boolean isEmpty();

}
