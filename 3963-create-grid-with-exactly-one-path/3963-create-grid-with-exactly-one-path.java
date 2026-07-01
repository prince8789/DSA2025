class Solution {
    public String[] createGrid(int m, int n) {
        
        String[] arr = new String[m];
        for(int i =0;i<m;i++){
            arr[i]="";
            for(int j =0;j<n;j++){
                if(i==0){
                    arr[i]+=".";
                }
                else if(i!=0 && j==n-1){
                    arr[i]+=".";
                }
                else{
                    arr[i]+="#";
                }
            }
        }
        return arr;
    }
}