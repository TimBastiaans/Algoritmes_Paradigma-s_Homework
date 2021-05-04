package main;

public class IdentifactionKey<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> add(String value, Node<T> parent) {
        Node<T> newNode = new Node<>();
        if (root == null) {
            newNode.setValue(value);
            root = newNode;
        } else {
            newNode.setValue(value);
            if (parent.getLeftChild() == null) {
                parent.setLeftChild(newNode);
            } else {
                Node<T> currentChild = parent.getLeftChild();
                while (currentChild.getSibling() != null) {
                    currentChild = currentChild.getSibling();
                }
                currentChild.setSibling(newNode);
            }
        }
        return newNode;
    }

    public void printTree() {
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "";
        }
        addLine(root, 0, strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    private void addLine(Node<T> node, int level, String[] strings) {
        strings[level] += node.getValue() + " ";
        Node<T> currentChild = node.getLeftChild();
        if (currentChild != null) {
            while (currentChild != null) {
                addLine(currentChild, level + 1, strings);
                currentChild = currentChild.getSibling();
            }
        }
    }

}
