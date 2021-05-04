package main;

public class TimesSevenHashTable {

    private static final int TABLE_SIZE =           11;

    public int [] numbers = new int[TABLE_SIZE];

    public void insert(int number){
        int index = TimesSevenHashTable.getHashIndex(number);
        numbers[index] = number;
    }

    public static int getHashIndex(int x){
        return x*7 % TABLE_SIZE;
    }

}
