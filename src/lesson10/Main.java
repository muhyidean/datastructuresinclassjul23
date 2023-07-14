package lesson10;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("dean","zaineh","yasmeen","mira","shaima","dean","moe","moe"));

        Set<String> set1 = new TreeSet<>();
        set1.addAll(list);


        Set<String> set2 = new TreeSet<>();
        set2.add("dean");
        set2.add("zaineh");
        set2.add("mira");

        set1.removeAll(set2);

        System.out.println(set1);


    }
}
