package lesson04;

public class SingleLinkedList<E> {

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


    public int size(){
        return size;
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
