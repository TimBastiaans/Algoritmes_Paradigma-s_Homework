package main;

public class Node<T> {

    private T value;
    private Node<T> sibling;
    private Node<T> leftChild;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getSibling() {
        return sibling;
    }

    public void setSibling(Node<T> sibling) {
        this.sibling = sibling;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) { this.leftChild = leftChild; }
}
