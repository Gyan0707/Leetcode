class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pp = new int[nums.length];
        pp[0] = 1;
        for(int i=1;i<nums.length;i++){
            pp[i] = pp[i-1] * nums[i-1];
        }
        int sp = 1;
        for(int j=nums.length-1;j>=0;j--){
            pp[j] = pp[j] * sp;
            sp = sp*nums[j];
        }
        return pp;
    }
}