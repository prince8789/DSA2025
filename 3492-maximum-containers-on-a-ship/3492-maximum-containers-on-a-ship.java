class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int c = 0;
        for(int i=n*n;i>0;i--){
            if(i*w > maxWeight){
                continue;
            }
            else{
                return i;
            }
        }
        return c;
        
    }
}