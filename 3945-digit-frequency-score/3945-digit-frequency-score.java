class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr = new int[10];
        // for(int i =0;i<arr.length;i++){
        //     arr[i]=-1;
        // }
        while(n>0){
            int num = n%10;
            arr[num]++;
            n=n/10;
        }
        int sum =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                sum = sum+i*arr[i];
            }
        }
        return sum;
    }
}