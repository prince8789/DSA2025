class Solution {
    public boolean checkGoodInteger(int n) {
        int sq = 0;
        int ds= 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sq = sq+rem*rem;
            ds = ds+rem;
        }
        return (sq-ds >=50 ?true:false);
    }
}