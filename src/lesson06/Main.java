package lesson06;

import lesson04.SingleLinkedList;

import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        StackI<String> st = new SingleLinkedList<>();

        st.push("A");
        st.push("B");
        System.out.println("Is it empty? " + st.isEmpty());
        st.push("C");
        System.out.println("The current top: " + st.peek());
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);

    }
}
