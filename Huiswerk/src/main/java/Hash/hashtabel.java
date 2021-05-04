package Hash;

public class hashtabel {
    private int[] array = new int[30];


    public static void main(String[] args) {
        hashtabel hashtest = new hashtabel();
        hashtest.insert(2, 2);
        hashtest.insert(4, 4);
        hashtest.insert(5, 5);
        hashtest.insert(1, 1);
        hashtest.insert(8, 8);
        hashtest.insert(14, 14);
        hashtest.insert(12, 12);

    }

    private int hash(int x){
        return x *7;
    }
    private void insert(int key, int value) {
        int index = this.hash(key) % 11;
        System.out.println("inserting " + value + " at " + index);
        this.array[index] = value;
    }


}