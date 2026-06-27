class Solution {
    public long removeZeros(long n) {
        long num=0;
        long a = 1;
        while(n>0){
            long rem = n%10;
            if(rem !=0){
                num = rem*a+num;
                a= a*10;
            }
            n=n/10;
        }
        return num;
    }
}