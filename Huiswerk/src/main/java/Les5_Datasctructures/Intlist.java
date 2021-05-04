package Les5_Datasctructures;

public  class Intlist {

    private int theSize = 6;
    private int[] theItems = new int[theSize];

    public int size() {
        return theSize;
    }

    public int get(int idx) {

        return theItems[idx];
    }

    public boolean set(int idx, int c) {
            theItems[idx] = c;
        return true;
    }

    public void printAll() {

        for (int i = 0; i < size(); i++)
            System.out.println(theItems[i]);


    }


//    public boolean add(AnyType c) {
//
//        if (theItems.length == size()) {
//            AnyType[] old = theItems;
//            theItems = (AnyType[]) new Object[size() * 2 + 1];
//            for (int i = 0; i < size(); i++)
//                theItems[i] = old[i];
//
//        }
//        theItems[theSize++] = c;
//        return true;
//
//    }


    public static void main(String[] args) {
        Intlist arraylist = new Intlist();

        arraylist.set(0, 3);
        arraylist.set(1, 6);

        arraylist.printAll();

    }
}