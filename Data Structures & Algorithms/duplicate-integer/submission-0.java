class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i= 0; i< nums.length; i++) {
            uniqueNums.add(nums[i]);
        }
        if (uniqueNums.size() != nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}