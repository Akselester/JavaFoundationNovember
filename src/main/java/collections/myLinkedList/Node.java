package collections.myLinkedList;

public class Node<T> {
    private T value;
    private Node<T> next;
    private Node<T> prev;

    public Node(Node<T> prev, Node<T> next, T value){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrev() {
        return this.prev;
    }
}
