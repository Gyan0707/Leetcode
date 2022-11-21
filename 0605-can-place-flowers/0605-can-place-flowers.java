class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean emptyleft = (i-1<0||flowerbed[i-1]==0);
                boolean emptyright = (i+1>=flowerbed.length||flowerbed[i+1]==0);
                if(emptyleft&&emptyright){
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count>=n;
    }
}