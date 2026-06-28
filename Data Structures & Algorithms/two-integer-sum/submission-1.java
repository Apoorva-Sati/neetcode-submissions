class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            if (list.containsKey(target - nums[i] ) == false){
                list.put(nums[i], i);
            }
            else{
                return new int[] { list.get(target- nums[i]), i};
            }
        }
        return new int[]{-1,-1};
    }
}