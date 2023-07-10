package lesson04;

import lesson06.ListI;
import lesson06.StackI;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleLinkedList<E> implements StackI<E>, Iterable<E>, ListI<E> {

    @Override
    public E push(E obj) {
        addFirst(obj);
        return head.data;
    }

    @Override
    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();

        return head.data;
    }

    @Override
    public E pop() {
        if(isEmpty())
            throw new EmptyStackException();

        E hand = head.data;
        removeFirst();
        return hand;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator<>(head);
    }
    private static class Node<E> {
        private Node next;
        private E data;

        // no reference
        public Node (E item){
            this.data = item;
            this.next = null;
        }

        // with reference
        public Node (E item, Node nodeRef){
            this.data = item;
            this.next = nodeRef;
        }

    }

    // Data fields
    private Node<E> head = null;
    private int size = 0;

    // O(1)
    private void addFirst(E item){
        Node temp = new Node(item, head); // node creation, made it point at the head's reference
        head = temp; // update the head
        size++;
    }

    //O(1)
    private void addAfter(E item, Node node){ // head -> A -> B -> C
        Node<E> temp = new Node(item, node.next); // (S, B) :  S -> C
        node.next = temp;
        size++;
    }

    //O(1)
    private E removeAfter(Node node){ // head -> A -> B -> C
        Node<E> toRemove = node.next; // toRemove -> C

        if(toRemove != null){
            node.next = toRemove.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    //O(1)
    private E removeFirst(){
        Node<E> toRemove = head;
        if(head != null){
            head = head.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }
    //O(n)
    private Node getNode(int index){ // head -> A -> B -> C -> D
        Node node = head;
        for (int i = 0; i < index && node != null ; i++) {
            node = node.next;
        }
        return node;
    }


    //O(n)
    public E get(int index){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        Node node = getNode(index); //O(n)
        return (E) node.data;
    }

    public void add(int index, E item){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        if(index ==0 ){
            addFirst(item); // O(1)
        }
        else{
            Node node = getNode(index-1); // O(n)
            addAfter(item,node);
        }
    }

    public void add(E item){
        add(size, item); // O(n)
    }

    public E set(int index, E newValue){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        Node<E> node = getNode(index);
        E result = node.data;
        node.data = newValue;
        return result;
    }

    public E remove(int index){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        if(index == 0){
            return removeFirst();
        }
        else{
            Node<E> prevNode = getNode(index - 1);
            return removeAfter(prevNode);
        }
    }


    public int findMin(){
        int min = (int) head.data;
        Node<E> current = head;
        while(current != null){
            if((int)current.data < min)
                min = (int) current.data;
            current = current.next;
        }
        return min;
    }

    public void traverse(){
        Node<E> current = head;
        // traverse
        while(current != null){
            // ==========
            // do something
            //===========
            current = current.next;
        }

    }

    public int size(){
        return size;
    }

    // LinkedListIterator class
    private static class MyLinkedListIterator<E> implements Iterator<E> {
        private Node<E> current;
        private Node<E> previous;
        private boolean removeCalled;

        public MyLinkedListIterator(Node<E> start) {
            this.current = start;
            this.removeCalled = false;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = current.data;
            current = current.next;
            return data;
        }

//        @Override
//        public void remove() {
//            if (removeCalled || previous == null) {
//                throw new IllegalStateException();
//            }
//            if (previous == head) {
//                head = head.next;
//            } else {
//                previous.next = current;
//            }
//            removeCalled = true;
//        }
    }

    public String toString() {
        Node current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }


}
