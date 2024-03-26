package exercises;

//Solves https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class MergeSortedArray {
    private int[] aArray;
    private final int aSize;
    private int[] bArray;
    private final int bSize;
    private int aIndex = 0;
    private int bIndex = 0;


    MergeSortedArray(int[] aArray, int aSize, int[] bArray, int bSize) {
        this.aArray = aArray;
        this.aSize = aSize;
        this.bArray = bArray;
        this.bSize = bSize;
    }

    public void merge() {
        while (aIndex <= aSize - 1 && bIndex <= bSize - 1) {
            if (aArray[aIndex] > bArray[bIndex] || aArray[aIndex] == 0) {
                openSpace(aIndex);
                aArray[aIndex] = bArray[bIndex];
                bIndex++;
                aIndex++;
            } else
                aIndex++;
        }
    }

    public void openSpace(int position) {
        for (int i = aArray.length - 1; i > position; i--) {
            aArray[i] = aArray[i - 1];
        }
    }

    public void printSortedArray() {
        for (int i = 0; i < aArray.length; i++) {
            System.out.println(aArray[i]);
        }
    }

    public static void main(String[] args) {
        int[] aArray = new int[]{2, 3, 3, 0, 0, 0};
        int[] bArray = new int[]{4, 5, 6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray(aArray, 6, bArray, 3);
        mergeSortedArray.merge();
        mergeSortedArray.printSortedArray();
    }
}
