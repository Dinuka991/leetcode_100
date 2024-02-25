package top100;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        var result = new int[2]; // Using var for type inference
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
   return result;
    }
}
