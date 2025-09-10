import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args) {
        prefixSum obj = new prefixSum();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        obj.PrefixSumArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] PrefixSumArray(int []arr){
        for(int i =1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    
}
