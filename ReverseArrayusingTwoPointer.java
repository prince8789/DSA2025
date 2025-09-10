import java.util.*;
public class ReverseArrayusingTwoPointer {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        // this is one approach
        


        // int [] ans = ReverseArray(arr);
        // for(int i =0 ; i<n;i++){
        //     System.out.print(ans[i]+" ");
        // }




        // and this one is another apporach without create new array 





        
        ReverseArray(arr);
        for(int i =0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }


        
    }
    public static int[] ReverseArray(int []arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
        return arr;
    }
}
