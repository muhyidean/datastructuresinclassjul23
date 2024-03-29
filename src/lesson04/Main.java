package lesson04;

import lesson03.MyArrayList;

import java.util.Iterator;

public class Main {

    public int countMatching(int target, SingleLinkedList<Integer> linkedList){
        int counter = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (target == linkedList.get(i))
                counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        MyArrayList arrList = new MyArrayList();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");

        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1,"D");
        System.out.println(list); // A -> D -> B -> C
        System.out.println(list.get(2)); // B
        list.set(1,"Z"); // A -> Z -> B -> C
        list.remove(2); // A -> Z -> C

        System.out.println(list); // A -> Z -> C

        SingleLinkedList<Integer> numList = new SingleLinkedList<>();

        numList.add(5);
        numList.add(25);
        numList.add(64);
        numList.add(1);
        numList.add(7);

//        //O(n^2)
//        for (int i = 0; i < numList.size(); i++) { // n
//            System.out.println(numList.get(i)); // n
//        }
//
//        // O(n)
//        for (int i = 0; i < arrList.size(); i++) { // n
//            System.out.println(arrList); // 1
//        }

        Iterator<Integer> iter = numList.iterator();

        while(iter.hasNext()){
            if(iter.next()<10)
                iter.remove();
        }

        System.out.println(numList);





    }



}
