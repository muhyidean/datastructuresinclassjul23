package lesson04;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1,"D"); // A -> D -> B -> C
        System.out.println(list); // A -> D -> B -> C
        System.out.println(list.get(2));

        SingleLinkedList<Integer> numList = new SingleLinkedList<>();

        numList.add(5);
        numList.add(8);

        SingleLinkedList<Student> students = new SingleLinkedList<>();




    }



}
