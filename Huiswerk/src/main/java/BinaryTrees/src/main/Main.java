package main;

public class Main {

    public static class Animals implements Comparable<Animals> {
        String name;

        public String getValue() {
            return name;
        }

        public void setValue(String value) {
            this.name = name;
        }


        @Override
        public int compareTo(Animals o) {
            return 0;
        }
    }

    public static void main(String [] args){
        //System.out.println("gucci main");
        //Main.main(null);
        testBinaryTree();
        // String value = (false) ? "Hello" : "World";
        //System.out.println(value);
    }

    private static void testBinaryTree(){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(4);
        tree.add(5);
        tree.add(8);
        tree.add(6);
        tree.add(7);
        tree.add(89);
        tree.add(10);
        tree.add(11);
        tree.add(50);
        tree.add(40);
        tree.add(60);
        tree.add(100);

        tree.printTree(10);
        System.out.println(tree.find(14));
        System.out.println(tree.findMax());
        System.out.println(tree.findMin());
        System.out.println("Leafcount: " + tree.countLeafs());

        System.out.println(tree.find(7).getLeftNode());
        System.out.println(tree.find(7).getRightNode());

        System.out.println("NodesCount: " + tree.countNodes());
        System.out.println("4NodesCount: " + tree.count4ChildNodes());
        System.out.println("countNodes2FromBottom: " + tree.countNodesFromBottom());
        System.out.println("singleNullChilds: " + tree.countSingleNullNodes());
    }


    private static void testIdentificationKey(){
        IdentifactionKey<Integer> tree = new IdentifactionKey<>();
        IdentifactionKey<Animals> key = new IdentifactionKey<Animals>();




        Animals dolfijn = new Animals();
        dolfijn.setValue("dolfijn");
        Animals aap = new Animals();
        aap.setValue("aap");
        Animals olifant = new Animals();
        olifant.setValue("olifant");

        key.add(dolfijn);
        key.add(olifant);
        key.add(aap);


//        tree.add(5);
//        tree.add(8);
//        tree.add(6);
//        tree.add(7);
//        tree.add(89);
//        tree.add(10);
//        tree.add(11);
//        tree.add(50);
//        tree.add(40);
//        tree.add(60);
//        tree.add(100);

//        tree.printTree(10);
//        System.out.println(tree.find(14));
//        System.out.println(tree.findMax());
//        System.out.println(tree.findMin());
//        System.out.println("Leafcount: " + tree.countLeafs());
//
//        System.out.println(tree.find(7).getLeftNode());
//        System.out.println(tree.find(7).getRightNode());
//
//        System.out.println("NodesCount: " + tree.countNodes());
//        System.out.println("4NodesCount: " + tree.count4ChildNodes());
//        System.out.println("countNodes2FromBottom: " + tree.countNodesFromBottom());
//        System.out.println("singleNullChilds: " + tree.countSingleNullNodes());
    }
}
