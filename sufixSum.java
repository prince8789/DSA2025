import java.util.Scanner;

public class sufixSum {
    public static void main(String[] args) {
        sufixSum obj = new sufixSum();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        obj.sufixSumArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] sufixSumArray(int []arr){
        for(int i =arr.length-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }
    
}
    

