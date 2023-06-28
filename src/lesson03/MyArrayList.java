package lesson03;

import java.util.Arrays;

public class MyArrayList {

    // Data Members
    private String [] arr;

    private int size = 0;

    private static final int INITIAL_CAPACITY = 10;
    private int capacity;

    public MyArrayList(){
        capacity = INITIAL_CAPACITY;
        arr = new String[capacity]; // This will create an array with size 10
    }

    public MyArrayList(int capacity){
        this.capacity = capacity;
        arr = new String[capacity]; // This will create an array with size capacity
    }

    /**
     * Add iwth no index, always adds at the end
     * @param item
     */
    // O(1)
    public void add(String item){
        if(size == capacity){
            reallocate();
        }
        arr[size] = item; // [A]
        size++;
    }

    // O(n)
    public void add(int index, String item){
        // Check if the value is within bounds
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        // Check if there is space
        if(size == capacity){
            reallocate();
        }
        // shift all the elements to the right
        for (int i = size ; i> index ; i--) {
            arr[i] = arr[i-1];
        }
        // insert item
        arr[index] = item;
        size++;
    }

    public int size(){
        return this.size;
    }

    private void reallocate(){
        capacity = capacity * 2;
        arr = Arrays.copyOf(arr,capacity); // [current items, new size]
    }

    // something was added

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1; ++i){
            sb.append(arr[i]+", ");
        }
        sb.append(arr[size-1]+"]");
        return sb.toString();
    }

}
