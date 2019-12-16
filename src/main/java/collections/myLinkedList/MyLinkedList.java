package collections.myLinkedList;

public class MyLinkedList<T> {
    private Node<T> startNode;
    private Node<T> endNode;
    private int size = 0;

    public MyLinkedList() {}

    public MyLinkedList(Node<T> startNode, Node<T> endNode) {
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public void add(int index, T o) {
        if (startNode == null) {
            startNode = new Node<T>(null, null, o);
        }
        else if (size == 1) {
            if (endNode == null) {
                endNode = new Node<T>(startNode, null, o);
                startNode.setNext(endNode);
            }
        }
        else {
            Node<T> prev = get(index - 1);
            Node<T> next = get(index);
            Node<T> insertNode = new Node<T>(prev, next, o);
            prev.setNext(insertNode);
            next.setPrev(insertNode);
        }
        size++;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Node<T> get(int index) {
        Node<T> currentNode;
        if (index == 0) {
            currentNode = startNode;
        }
        else if (index <= (size / 2)) {
            currentNode = startNode;
            for (int i = 1; i <= index; i++) {
                currentNode = currentNode.getNext();
            }
        }
        else {
            currentNode = endNode;
            for (int i = 1; i <= size - index - 1; i++) {
                currentNode = currentNode.getPrev();
            }
        }
        return currentNode;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public void printList(){
        for (int i = 0; i < size; i++) {
            System.out.print(get(i).getValue() + " ");
        }
        System.out.println();
    }
}
