package main;

public class IdentifactionKey<T extends Comparable<T>> {

    private Node<T> root;

    public void add(T value){
        Node<T> newNode = new Node<>();
        newNode.setValue(value);
        if(root == null){
            root = newNode;
            return;
        }

        Node<T> currentNode = root;
        while(true){
            T currentNodeValue = currentNode.getValue();
            if(currentNodeValue.compareTo(value) == -1){
                if(currentNode.getRightNode() != null){
                    currentNode = currentNode.getRightNode();
                }else{
                    currentNode.setRightNode(newNode);
                    break;
                }
            }else if(currentNodeValue.compareTo(value) == 1){
                if(currentNode.getLeftNode() != null){
                    currentNode = currentNode.getLeftNode();
                }else{
                    currentNode.setLeftNode(newNode);
                    break;
                }
            }else{
                //duplicate numbers
                break;
            }
        }
    }

    public void printTree(int depth) {
        String[] strings = new String[depth];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "";
        }
        addLine(root, 0, strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    private void addLine(Node<T> node, int level, String[] strings) {
        if(node == null){
            return;
        }
        strings[level] += node.getValue() + " ";
        addLine(node.getLeftNode(), level+1, strings);
        addLine(node.getRightNode(), level+1, strings);
    }

    public Node<T> find(T value){
        return recursiveFind(value, root);
    }

    private Node<T> checkNode(T value, Node<T> node){
        if(node.getValue() == value){
            return node;
        }
        if(node.getLeftNode() != null) {
            Node<T> left = checkNode(value, node.getLeftNode());
            if (left != null) {
                return left;
            }
        }
        if(node.getRightNode() != null) {
            Node<T> right = checkNode(value, node.getRightNode());
            if (right != null) {
                return right;
            }
        }
        return null;
    }

    private Node<T> recursiveFind(T value, Node<T> node){
        if(node.getValue() == value){
            return node;
        }
        if(value.compareTo(node.getValue()) == 1){ //greater than
            if(node.getRightNode() == null){
                return null;
            }
            return recursiveFind(value, node.getRightNode());
        }else{
            if(node.getLeftNode() == null){
                return null;
            }
            return recursiveFind(value, node.getLeftNode());
        }
    }

    public T findMax(){
        return findMax(root);
    }

    private T findMax(Node<T> node){
        if(node.getRightNode() != null){
            return findMax(node.getRightNode());
        }
        return node.getValue();
    }

    public T findMin(){
        return findMin(root);
    }

    private T findMin(Node<T> node){
        if(node.getLeftNode() != null){
            return findMin(node.getLeftNode());
        }
        return node.getValue();
    }

    public int countLeafs(){
        return countLeafs(root);
    }

    public int countLeafs(Node<T> node){
        if(node.getRightNode() == null && node.getLeftNode() == null){
            return 1;
        }
        if(node.getRightNode() == null){
            return countLeafs(node.getLeftNode());
        }
        if(node.getLeftNode() == null){
            return countLeafs(node.getRightNode());
        }
        return countLeafs(node.getLeftNode())  + countLeafs(node.getRightNode());
    }

    public int countNodes(){
        return countNodes(root);
    }
//nieuwe oplossing staat iets naar onder
//    public int countNodes(Node<T> node) {
//        if (node.getRightNode() == null && node.getLeftNode() == null) {
//            return 1;
//        }
//        int children = 0;
//        if ( node.getLeftNode() != null){
//            children += countNodes(node.getLeftNode());
//        }
//        if ( node.getRightNode() != null){
//            children += countNodes(node.getRightNode());
//        }
//        return 1 + children;
//    }

    public int count4ChildNodes(){
        return count4ChildNodes(root);
    }

    public int count4ChildNodes(Node <T> node){
        int countOfChildren = 0;
        if(node.getLeftNode() != null){
            if(countNodes(node.getLeftNode()) > 3){
                countOfChildren += count4ChildNodes(node.getLeftNode()) + 1;
            }
        }
        if(node.getRightNode() != null){
            if(countNodes(node.getRightNode()) > 3){
                countOfChildren += count4ChildNodes(node.getRightNode()) + 1;
            }
        }
        return countOfChildren;
    }


    public int countNodes(Node<T> node){
        if(node == null){
            return 0;
        }
        return countNodes(node.getLeftNode()) + countNodes(node.getRightNode()) + 1;
    }

    //minimaal twee van de onderkant af, > 3 nodes eronder zichzelf.
    public int countNodesFromBottom() {
        return countNodesFromBottom(root);
    }

    public int countNodesFromBottom(Node<T> node){
        if(countDepth(node) < 3){
            return 0;
        }
        return countNodesFromBottom(node.getLeftNode()) + countNodesFromBottom(node.getRightNode()) + 1;

    }


    public int countDepth(Node<T> node){
        if(node == null){
            return 0;
        }
        int left = countDepth(node.getLeftNode());
        int right = countDepth(node.getRightNode());
        if ( left > right){
            return left + 1;
        }else{
            return right + 1;
        }
    }

    public int countSingleNullNodes() {
        return countSingleNullNodes(root);
    }

    public int countSingleNullNodes(Node<T> node) {
        // if empty tree
        if(node == null) {
            return 0;
        }
        // if leaf node
        if(node.getLeftNode() == null && node.getRightNode() == null ) {
            return 0;
        }
        // if both left and right subtrees are not null
        // they are full
        if((node.getLeftNode() !=null) && (node.getRightNode() !=null)) {
            return (countSingleNullNodes(node.getLeftNode()) + countSingleNullNodes(node.getRightNode()));
        }
        if((node.getLeftNode() !=null)) {
            return 1 + (countSingleNullNodes(node.getLeftNode()));
        }
        if((node.getRightNode() !=null)) {
            return 1 + (countSingleNullNodes(node.getRightNode()));
        }
        // if none work
        return 0;
    }
}
