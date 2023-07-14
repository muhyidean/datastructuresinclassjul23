package lesson05;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee(111,"dean",10);

        System.out.println(emp);

        List<Integer> nums = new LinkedList<>( Arrays.asList(5,1,9,3,6) );




//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + 10 + " ");
//        }

        for (Integer i : nums){
            System.out.print(i + " ");
        }

//        System.out.println();
//        System.out.println("===");
//        System.out.println(nums);
    }
}
