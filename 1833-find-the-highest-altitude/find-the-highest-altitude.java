class Solution {
    public int largestAltitude(int[] gain) {
        int max =0;
        int currmax = 0;
        for(int i =0;i<gain.length;i++){
            currmax +=gain[i];
            max = Math.max(currmax,max);
        }
        return max;
        
    }
}