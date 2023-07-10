package lesson07;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList();

        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q.remove()); // A
        System.out.println(q.size());

    }
}
