package exercises;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i],0) + 1);
            if (hashMap.get(nums[i]) > (nums.length / 2))
                return nums[i];
        }
        return -1;
    }
}
