package main;

public class InsertionSort implements CustomSort {

    @Override
    public int[] sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (isLowerThanPreviousIndex(j, values)) {
                    switchValues(j, j - 1, values);
                }
            }
        }
        return values;
    }

    private boolean isLowerThanPreviousIndex(int index, int[] values) {
         return index > 0 && values[index] < values[index - 1];
    }

    private void switchValues(int index1, int index2, int[] values) {
        int temp = values[index1];
        values[index1] = values[index2];
        values[index2] = temp;
    }
}
