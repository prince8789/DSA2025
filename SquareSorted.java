import java.util.Scanner;
public class SquareSorted {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int [] ans=SortedSquareArray(arr);
        ans = ReverseArray(ans);
        for(int i =0 ; i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int [] SortedSquareArray(int []arr){
        int [] ans = new int[arr.length];
        int end = arr.length-1;
        int start =0;
        int j = 0;
        while(start<=end){
            if(Math.abs(arr[start]) > Math.abs(arr[end])){
                ans[j++]=arr[start]*arr[start];
                start++;
            }
            else{
                ans[j++]=arr[end]*arr[end];
                end--;
            }
            
        }
        return ans;
    }
        public static int[] ReverseArray(int []arr){
        int [] ans = new int[arr.length];
        int j=0;
        for(int i = arr.length-1;i>=0;i-- ){
            ans[j++]=arr[i];
           // j++;      for this we use ans[j++] because post increment operter first execute and then incremment
        }
        return ans;

    }
    
}

