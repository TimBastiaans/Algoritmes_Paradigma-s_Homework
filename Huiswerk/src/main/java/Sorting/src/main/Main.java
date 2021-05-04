package main;

public class Main {


    /* 8.1 numbers: 8,1,4,1,5,9,2,6,5 */

    /* 8.1 a insertion sort
     *
     * 8,1,4,1,5,9,2,6,5
     * 1,8,4,1,5,9,2,6,5
     * 1,4,8,1,5,9,2,6,5
     * 1,4,8,1,5,9,2,6,5
     * 1,1,4,8,5,9,2,6,5
     * 1,1,4,5,8,9,2,6,5
     * 1,1,2,4,5,8,9,6,5
     * 1,1,2,4,5,5,8,9,6
     * 1,1,2,4,5,5,6,8,9
     * */

    /* 8.1 c merge sort
     *
     *  8,1,4,1,5,9,2,6,5
     *  8,1,4,1,5       9,2,6,5
     *  8,1,4       1,5     9,2     6,5
     *  8,1     4       1,5     9,2     6,5 --laagste recursie
     *  1,8     4       1,5     2,9     5,6 -- eerste keer iets veranderd
     *
     *  1,4,8       1,5     2,9     5,6     --samengevoegd (niveau hoger)
     *  1,1,4,5,8       2,5,6,9             --samengevoegd (niveau hoger)
     *  1,1,2,4,5,5,6,8,9                   --eind
     * */

    /* 8.1 d Quicksort with pivot middle element
     *
     * 8,1,4,1,5,9,2,6,5
     * pivot = 5, switch 8 and 5
     * 5,1,4,1,5,9,2,6,8
     * switch 5 and 2
     * 5,1,4,1,2,9,5,6,8
     * switch 5 and 9
     * 5,1,4,1,2,5,9,6,8
     *
     * 5,1,4,1,2,5
     * pivot = 4, switch 5 and 2
     * 2,1,4,1,5,5
     * switch 4 and 1
     * 2,1,1,4,5,5
     *
     * 1,1,2    4,5,5
     * */


    /* 8.4 running time equal keys
    * a. O(N)
    * c. O(Nlog(N))
    * d. O(0)
    * */

    /* 8.5 running time sorted array
     * a. O(N)
     * c. O(Nlog(N))
     * d. O(0)
     * */

    public static void main(String [] args){
        sortTest();
    }

    private static void sortTest(){
        int [] values1 = {2,3,4,5,6,23,68,7,8,1};
        int [] values2 = {};
        int [] values3 = {3};
        int [] values4 = {1,1,1,1,1,1};
//        CustomSort insertionSort = new InsertionSort();
//        printArray(insertionSort.sort(values1));
//        printArray(insertionSort.sort(values2));
//        printArray(insertionSort.sort(values3));
//        printArray(insertionSort.sort(values4));

//        CustomSort mergeSort = new MergeSort();
//        printArray(mergeSort.sort(values1));
//        printArray(mergeSort.sort(values2));
//        printArray(mergeSort.sort(values3));
//        printArray(mergeSort.sort(values4));

        CustomSort quickSort = new QuickSort();
        printArray(quickSort.sort(values1));
        printArray(quickSort.sort(values2));
        printArray(quickSort.sort(values3));
        printArray(quickSort.sort(values4));
    }


    private static void printArray(int [] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
    }
}
