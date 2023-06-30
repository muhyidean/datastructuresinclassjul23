package lesson04;

public class Main {

    public static void main(String[] args) {
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

        System.out.println(numList.findMin());
        numList.traverse();





    }



}
