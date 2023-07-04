package lesson06;

public interface ListI<E> {

    public E get(int index);

    public void add(int index, E item);

    public void add(E item);

    public E set(int index, E newValue);

    public E remove(int index);

}
