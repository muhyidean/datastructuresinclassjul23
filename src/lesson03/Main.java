package lesson03;

public class Main {

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        list.add("A");
        list.add("B");
        System.out.println(list.size());
        System.out.println(list);
        list.add(1,"Z");
        System.out.println(list);
        list.add(0,"E");
        System.out.println(list);
        list.add("M");
        list.add("M");
        list.add("M");
        list.add("M");
        list.add("M");
        list.add("M");
        list.add("M");
        System.out.println(list);




    }
}
