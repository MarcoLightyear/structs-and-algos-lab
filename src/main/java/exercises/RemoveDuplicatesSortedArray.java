package exercises;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && i!=0) {
                if (nums[i] == nums[i - 1]) {
                    for (int j = i + 1; j < nums.length; j++) {
                        nums[j - 1] = nums[j];
                    }
                    nums[nums.length - 1] = 0;
                } else
                    k++;
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesSortedArray remover = new RemoveDuplicatesSortedArray();
        int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(remover.removeDuplicates(array));
    }
}