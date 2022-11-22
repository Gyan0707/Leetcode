class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int n1= Math.abs(nums[i]);
            if(nums[n1-1]>0){
                nums[n1-1] = -1*nums[n1-1];
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]>0){
                list.add(j+1);
                    
            }
        }
        return list;
    }
}