package algorithms;

public class SelectionSort {
    public void sort(int[] array) {
        int iterationStartingPoint = 0;
        while (iterationStartingPoint < array.length) {
            int lowestIndex = iterationStartingPoint;
            for (int i = iterationStartingPoint; i < array.length; i++) {
                if (array[i] < array[lowestIndex]) {
                    lowestIndex = i;
                }
            }
            if (lowestIndex != iterationStartingPoint) {
                int tmp = array[iterationStartingPoint];
                array[iterationStartingPoint] = array[lowestIndex];
                array[lowestIndex] = tmp;
            }
            iterationStartingPoint++;
        }
    }
}
