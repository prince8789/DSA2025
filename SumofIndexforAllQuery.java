import java.util.Scanner;

public class SumofIndexforAllQuery {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        System.out.println("enter the element of array ");
        for(int i =1 ; i<=n ;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the number of query");
        int q = sc.nextInt();
        sumofindex(arr);
        while(q>0){
            System.out.println("enter the starting index");
            int l = sc.nextInt();
            System.out.println("enter the ending index");
            int r = sc.nextInt();
            int sum =0;
            sum= arr[r]-arr[l];
            System.out.println("the sum is"+sum);
            q--;

        }
        
    }
    public static int [] sumofindex(int []arr){
        for(int i =2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;

    }
    
}
