package main;

public class QuickSort implements CustomSort {
    @Override
    public int[] sort(int[] values) {
        quickSort(values, 0, values.length-1);
        return values;
    }

    private void quickSort(int [] values, int left, int right){
        if(right - left <= 0)
            return;

        int pivot = values[right];

        int pivotLocation = partitionArray(values, left, right, pivot);

        quickSort(values, left, pivotLocation-1);
        quickSort(values, pivotLocation + 1, right);

    }

    private int partitionArray(int [] values, int left, int right, int pivot){
        int leftPointer = left -1;
        int rightPointer = right;

        while(true){

            while(values[++leftPointer] < pivot){
                ;
            }

            while(rightPointer > 0 && values[--rightPointer] > pivot){
                ;
            }

            if(leftPointer >= rightPointer){
                break;
            }else{
                switchValues(leftPointer, rightPointer, values);
            }
        }
        switchValues(leftPointer, right, values);
        return leftPointer;
    }

    private void switchValues(int index1, int index2, int[] values) {
        int temp = values[index1];
        values[index1] = values[index2];
        values[index2] = temp;
    }
}
