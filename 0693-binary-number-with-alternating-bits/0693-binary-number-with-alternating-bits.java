class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n>0){
            int bit=n%2;
            n=n/2;
            int nextnum = n%2;
            if(bit == nextnum) return false;
        }
        return true;
    }
}