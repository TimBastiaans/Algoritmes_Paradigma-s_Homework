public class Les3_sorting {

    public static void main(String[] args) {
       insertionSort(new int[]{8, 6, 0, 7, 5, 3, 1});
       System.out.println("");
       mergeSort(new int[]{8, 6, 0, 7, 5, 3, 1});

    }

    ///////////////////////////////////////////////////////////////////////////////////////
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int toBeInserted = a[i];

            int j = i;
            while (j > 0 && toBeInserted < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = toBeInserted;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////
       public static void mergeSort(int[] a) {
        int[] tmpArray = new int[a.length];
        mergeSort(a, tmpArray, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void mergeSort(int[] a, int[] tmpArray, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmpArray, left, center);
            mergeSort(a, tmpArray, center + 1, right);
            merge(a, tmpArray, left, center + 1, right);
        }
    }

    private static void merge(int[] a, int[] tmpArray, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpStart = leftPos;
        int numElements = rightEnd - leftPos + 1;

        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (a[leftPos] < a[rightPos]) {
                tmpArray[tmpStart] = a[leftPos];
                tmpStart++;
                leftPos++;
            } else {
                tmpArray[tmpStart] = a[rightPos];
                tmpStart++;
                rightPos++;
            }
        }
        while(leftPos <= leftEnd){
            tmpArray[tmpStart] = a[leftPos];
            tmpStart++;
            leftPos++;
        }
        while(rightPos <= rightEnd){
            tmpArray[tmpStart] = a[rightPos];
            tmpStart++;
            rightPos++;
        }
        for(int i = 0; i < numElements; i++, rightEnd--){
            a[rightEnd] = tmpArray[rightEnd];
        }

    }


}


