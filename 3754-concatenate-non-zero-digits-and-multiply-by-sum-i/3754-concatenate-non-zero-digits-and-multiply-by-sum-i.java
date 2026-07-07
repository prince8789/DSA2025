class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        long sum =0;
        long mul =1;
        while(n>0){
            long rem = n%10;
            
            if(rem != 0){
                sum+=rem;
                num= num+rem*mul;
                mul = mul*10;
            }
            n=n/10;
        }
        return sum*num;
        
    }
}