import java.util.*;
public class sorting0Ans1s {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        SortedArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int []SortedArray(int []arr){
        int start =0;
        int end = arr.length-1;
        int temp =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[start]==0){
                start++;
            }
            else{
                if(arr[end]==1){
                    end--;
                }
                else{
                    temp =arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;

                }
            }
        }
        return arr;
    }
    
}
