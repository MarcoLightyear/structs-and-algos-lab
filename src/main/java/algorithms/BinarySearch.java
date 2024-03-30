package algorithms;

public class BinarySearch {
    public int search(int[] array, int value) {
        int lowerBound = 0;
        int upperBound = array.length - 1;
        do {
            int midpoint = (upperBound + lowerBound) / 2;
            int valueAtMidpoint = array[midpoint];
            if (value < valueAtMidpoint) {
                upperBound = midpoint - 1;
            } else if (value > valueAtMidpoint) {
                lowerBound = midpoint + 1;
            } else if (valueAtMidpoint == value) {
                return midpoint;
            }
        } while (lowerBound <= upperBound);
        return -1;
    }
}
