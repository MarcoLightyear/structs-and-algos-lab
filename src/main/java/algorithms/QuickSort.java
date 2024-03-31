package algorithms;

public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void swap(int leftPointer, int rightPointer) {
        int tmp = array[leftPointer];
        array[leftPointer] = array[rightPointer];
        array[rightPointer] = tmp;
    }

    public int partition(int leftPointer, int rightPointer) {
        int pivotPosition = rightPointer;
        int pivot = array[pivotPosition];
        rightPointer--;
        while (true) {
            while (array[leftPointer] < pivot) {
                leftPointer++;
            }
            while (array[rightPointer] > pivot) {
                rightPointer--;
            }
            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(leftPointer, rightPointer);
            }
        }
        swap(leftPointer, pivotPosition);
        return leftPointer;
    }

    public void sort(int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0)
            return;
        int pivotPosition = partition(leftIndex, rightIndex);
        sort(leftIndex, pivotPosition - 1);
        sort(pivotPosition + 1, rightIndex);
    }
}
