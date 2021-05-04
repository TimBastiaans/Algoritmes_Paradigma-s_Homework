package main;

public class MergeSort implements CustomSort {
    @Override
    public int[] sort(int[] values) {
        int[] temp = new int[values.length];
        mergeSort(0, values.length - 1, values, temp);
        return values;
    }

    public void mergeSort(int left, int right, int[] values, int[] temp) {
        if (left >= right) {
            return;
        }
        int center = (left + right) / 2;
        mergeSort(left, center, values, temp);
        mergeSort(center + 1, right, values, temp);
        merge(left, right, values, temp);
    }

    public void merge(int left, int right, int[] values, int[] temp) {
        int middle = (left + right) / 2;
        int leftEnd = middle;
        int rightStart = middle + 1;
        int totalLength = right - left + 1;

        int leftIndex = left;
        int rightIndex = rightStart;
        int tempArrayIndex = left;

        while (leftIndex <= leftEnd && rightIndex <= right) {
            if (values[leftIndex] <= values[rightIndex]) {
                temp[tempArrayIndex] = values[leftIndex];
                leftIndex++;
            } else {
                temp[tempArrayIndex] = values[rightIndex];
                rightIndex++;
            }
            tempArrayIndex++;
        }

        System.arraycopy(values, leftIndex, temp, tempArrayIndex, leftEnd -  leftIndex + 1);
        System.arraycopy(values, rightIndex, temp, tempArrayIndex, right -  rightIndex + 1);
        System.arraycopy(temp, left, values, left, totalLength);
    }
}
