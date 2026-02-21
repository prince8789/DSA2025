class Solution {
    static boolean isprime(int n ){
        int flag =0;
        if(n<=1) return false;
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i =left;i<right+1;i++){
            int bit = Integer.bitCount(i);
            if(isprime(bit)){ 
                count++;
            }
        }
        return count;
    }
}