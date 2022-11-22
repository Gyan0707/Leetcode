class Solution {
    public int hammingDistance(int x, int y) {
         int count = 0; 
        int xor = x^y;
       /* while (xor > 0) {
            if ((xor&1) == 1) {
                count ++;
            }
            xor = xor >> 1;
        }
        return count;*/
        int mask =1;
        for(int i=1;i<=32;i++){
            if((xor & mask)!=0){
                count++;
            }
            mask<<=1;
        }
        return count;
    }
}