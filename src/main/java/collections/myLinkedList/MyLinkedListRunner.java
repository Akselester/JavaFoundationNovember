package collections.myLinkedList;

public class MyLinkedListRunner {
    public static void main(String[] args) {
//        Node<Integer> nodeStart = new Node<>();
//        Node<Integer> node2 = new Node<>();
//        Node<Integer> nodeEnd = new Node<>();
//        nodeStart.setNext(node2);
//        node2.setPrev(nodeStart);
//        node2.setNext(nodeEnd);
//        nodeEnd.setPrev(node2);
//
//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(nodeStart, nodeEnd);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1, 1);
        myLinkedList.add(1, 2);
        myLinkedList.add(1, 3);
        myLinkedList.printList();
    }
}
