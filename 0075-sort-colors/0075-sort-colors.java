class Solution {
    public void sortColors(int[] nums) {
        int left = 0 ,mid = 0, right = nums.length-1;
        while(mid<=right){
            if(nums[mid] == 0){
                swapnums(left,mid,nums);
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swapnums(mid,right,nums);
                right--;
            }
        }
    }
    public void swapnums(int a, int b,int[] nums){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}