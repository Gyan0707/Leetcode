class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                nums[i] = nums.length +1;
            }
        }
        for(int j= 0;j<nums.length;j++){
            int index = Math.abs(nums[j]) -1;
            if(index < nums.length && nums[index] >0){
                nums[index] = -1*nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] >0){
                return i+1;
            }
        }
        return nums.length +1;
    }
}