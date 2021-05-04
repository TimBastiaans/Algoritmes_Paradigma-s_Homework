package main;

public class Main {

    public static void main(String [] args){
       testTimesSeven();
    }

    private static void testTimesSeven(){
        TimesSevenHashTable timesSevenHashTable = new TimesSevenHashTable();
        timesSevenHashTable.insert(2);
        timesSevenHashTable.insert(4);
        timesSevenHashTable.insert(5);
        timesSevenHashTable.insert(1);
        timesSevenHashTable.insert(8);
        timesSevenHashTable.insert(14);
        timesSevenHashTable.insert(12);

        for(int i = 0; i< timesSevenHashTable.numbers.length;i++){
            System.out.println(timesSevenHashTable.numbers[i]);
        }
    }

}
