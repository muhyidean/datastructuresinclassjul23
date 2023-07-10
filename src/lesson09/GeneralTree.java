package lesson09;

import java.util.ArrayList;
import java.util.List;

public class GeneralTree<E> {

    private Node<E> root;
    private int nodeCount;

    public static class Node<E>{

        private Node<E> parent;
        private E data;
        private List<Node> children;

        public Node(E item){
            data = item;
            children = new ArrayList<>();
            parent = null;
        }
    }


    public void addRoot(Node<E> node){
        this.root = node;
        nodeCount++;
    }

    public void addChild(Node<E> parentNode, Node<E> childNode){ // (A , B)
        parentNode.children.add(childNode);
        childNode.parent = parentNode;
        nodeCount++;
    }

    public int size(){
        return nodeCount;
    }

    public E getParent(Node<E> node){
        return node.parent.data;
    }

    public boolean areSiblings(Node<E> node1, Node<E> node2){
        return node1.parent.equals(node2.parent);
    }


    public void printPreOrder(Node<E> node){
        System.out.println(node.data);
        for (int i = 0; i < node.children.size(); i++) {
            printPreOrder(node.children.get(i));
        }
    }

    public void printPreOrderU(Node<E> node){
        int depth = countParents(node);
        for (int i = 0; i < depth; i++) {
            System.out.print("* ");
        }
        System.out.println(node.data);
        for (int i = 0; i < node.children.size(); i++) {
            printPreOrderU(node.children.get(i));
        }
    }

    public int countParents(Node<E> node){
        int count = 0;
        while(node.parent != null){
            count++;
            node = node.parent;
        }
        return count;
    }




    public static void main(String[] args) {
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");
        Node<String> nodeD = new Node<>("D");
        Node<String> nodeE = new Node<>("E");
        Node<String> nodeF = new Node<>("F");
        Node<String> nodeY = new Node<>("Y");
        Node<String> nodeZ = new Node<>("Z");

        GeneralTree<String> tree = new GeneralTree<>();

        tree.addRoot(nodeA);
        System.out.println(tree.size());

        tree.addChild(nodeA,nodeB);
        tree.addChild(nodeA,nodeC);
        tree.addChild(nodeA,nodeD);

        tree.addChild(nodeB,nodeE);
        tree.addChild(nodeB,nodeF);

        tree.addChild(nodeC,nodeY);
        tree.addChild(nodeC,nodeZ);

        System.out.println(tree.root.data); // A
        System.out.println(tree.root.children.get(1).data); // C

        System.out.println("Parent of Node B: " + tree.getParent(nodeB));
        System.out.println("Parent of Node Y: " + tree.getParent(nodeY));

        System.out.println("Are B and C siblings: " + tree.areSiblings(nodeB,nodeC));
        System.out.println("Are F and Y siblings: " + tree.areSiblings(nodeF,nodeY));

        System.out.print("Children of C: ");


        System.out.println( "====");

        tree.printPreOrder(tree.root);

    }


}
