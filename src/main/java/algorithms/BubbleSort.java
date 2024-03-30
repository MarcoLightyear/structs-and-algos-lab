package algorithms;

public class BubbleSort {
    public void sort(int[] array) {
        int indexUntilSorted = array.length - 1;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < indexUntilSorted; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }
            indexUntilSorted--;
        }
    }
}
