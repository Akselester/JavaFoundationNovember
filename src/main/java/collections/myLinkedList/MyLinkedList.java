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
        return size == 0;
    }

    public boolean contains(T o) {
        if (indexOf(o) != -1) {
            return true;
        }
        else {
        return false;
        }
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (Node<T> node = startNode; node != null; node = node.getNext()) {
            array[i] = node.getValue();
            i++;
        }
        return array;
    }

    public void add(int index, T o) {
        if (startNode == null) {
            startNode = new Node<>(null, null, o);
        }
        else if (size == 1) {
            if (endNode == null) {
                endNode = new Node<>(startNode, null, o);
                startNode.setNext(endNode);
            }
        }
        else {
            Node<T> prev = get(index - 1);
            Node<T> next = get(index);
            Node<T> insertNode = new Node<>(prev, next, o);
            prev.setNext(insertNode);
            next.setPrev(insertNode);
        }
        size++;
    }

    public boolean remove(Object o) {
        if (o == null) {
            for (Node<T> node = startNode; node != null; node = node.getNext()) {
                if (node.getValue() == null) {
                    erase(node);
                    return true;
                }
            }
        }
        else {
            for (Node<T> node = startNode; node != null; node = node.getNext()) {
                if (o.equals(node.getValue())) {
                    erase(node);
                    return true;
                }
            }
        }
        return false;
    }

    private T erase(Node<T> node) {
        T value = node.getValue();
        Node<T> next = node.getNext();
        Node<T> previous = node.getPrev();
        if(previous == null) {
            startNode = next;
        }
        else {
            previous.setNext(next);
            node.setPrev(null);
        }
        if (next == null) {
            endNode = previous;
        }
        else {
            next.setPrev(previous);
            node.setNext(null);
        }
        node.setValue(null);
        size--;
        return value;
    }

    public void clear() {
        startNode = null;
        endNode = null;
        size = 0;
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

    public T set(int index, T element) {
        Node<T> currentNode = get(index);
        T oldValue = currentNode.getValue();
        currentNode.setValue(element);
        return oldValue;
    }

    public int indexOf(T o) {
        Node<T> currentNode = startNode;
        for (int i = 0; i < size; i++) {
            if(currentNode.getValue().equals(o)) {
                return i;
            }
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    public void printList(){
        for (int i = 0; i < size; i++) {
            System.out.print(get(i).getValue() + " ");
        }
        System.out.println();
    }
}
