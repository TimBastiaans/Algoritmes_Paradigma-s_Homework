package main;

public class Main {

        public static void main(String [] args){
            testTree();
        }

        private static void testTree(){
            Tree<Animals> tree = new Tree<>();
            IdentifactionKey<Animals> key = new IdentifactionKey<>();


            Animals dolfijn = new Animals();
            dolfijn.setValue("dolfijn");
            Animals aap = new Animals();
            aap.setValue("aap");
            Animals olifant = new Animals();
            olifant.setValue("olifant");

            Node<Animals> root = tree.add("Leeft het op het land?", null);
            Node<Animals> n1 = tree.add(dolfijn.getValue(), root);
            Node<Animals> n2 = tree.add("Eet het fruit?", root);
            Node<Animals> n3 = tree.add(olifant.getValue(), n2);
            Node<Animals> n4 = tree.add(aap.getValue(), n2);

            Node<Integer> n11 = tree.add(11, n1);
            Node<Integer> n12 = tree.add(12, n1);
            Node<Integer> n21 = tree.add(21, n2);
            Node<Integer> n22 = tree.add(22, n2);

            System.out.println("Sibbo: " + n2.getSibling().getValue().toString() + " left child : " + n2.getLeftChild().getValue().toString());
            tree.printTree();
        }



//    Animals dolfijn = new Animals();
//        dolfijn.setValue("dolfijn");
//    Animals aap = new Animals();
//        aap.setValue("aap");
//    Animals olifant = new Animals();
//        olifant.setValue("olifant");
//
//        key.add(dolfijn);
//        key.add(olifant);
//        key.add(aap);


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
}
