class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int first = n/20;
        int last =n-first;
        float a = n- first*2;
        double sum =0;
        for(int i =first;i<last;i++){
            sum = sum+arr[i];
        }
        return sum/a;
        
    }
}