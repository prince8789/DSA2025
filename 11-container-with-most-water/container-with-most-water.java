class Solution {
    public int maxArea(int[] height) {
        int maxc=0;
        int l =0;
        int r = height.length-1;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int max=(r-l)*h;
            maxc = Math.max(max,maxc);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxc;
        
    }
}