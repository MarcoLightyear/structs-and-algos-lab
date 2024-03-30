package algorithms;

public class BubbleSort {
    public void sort(int[] array) {
        int indexUntilSorted = array.length - 1;
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i<indexUntilSorted; i++){
                if(array[i] > array[i+1]){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    sorted = false;
                }
            }
            indexUntilSorted--;
        }
    }

    public void printSorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 3, 0, 0, 0};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
        sorter.printSorted(array);
    }
}
