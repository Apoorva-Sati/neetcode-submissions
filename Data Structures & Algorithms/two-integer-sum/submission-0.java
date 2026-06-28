class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            for ( int i = j + 1 ; i < nums.length ; i++ ){
                if (nums[i] == diff){
                    return new int[]{j, i};
                }
            }
        }
        return new int[]{};
    }
}