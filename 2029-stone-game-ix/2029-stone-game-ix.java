class Solution {
    public boolean stoneGameIX(int[] stones) {
        int count0 = 0;
        int count1 =0;
        int count2 =0;
        for(int num : stones){
            if(num%3==0){
                count0++;
            }
            else if(num %3 == 1){
                count1++;
            }
            else{
                count2++;
            }
        }
        if(count0 % 2== 0){
            return count1 >=1 && count2>=1;
        }
        return Math.abs(count1 - count2) > 2;
        
    }
}