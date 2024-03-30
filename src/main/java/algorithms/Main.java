package algorithms;

public class Main {
    public static void printSorted(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 3, 1, 0, 0};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        printSorted(array);
    }
}