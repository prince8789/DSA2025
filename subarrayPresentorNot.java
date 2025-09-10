import java.util.Scanner;

public class subarrayPresentorNot {
    public static void main(String[] args) {
        subarrayPresentorNot obj = new subarrayPresentorNot();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        obj.PrefixSumArray(arr);
        System.out.println(obj.subarraywitheqaualsum(arr));
    }
    public static int [] PrefixSumArray(int []arr){
        for(int i =1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    boolean subarraywitheqaualsum(int []arr){
        int totalSum = arr[arr.length-1];
        for(int i =0; i<arr.length;i++){
            if(arr[i]==totalSum-arr[i]){
                return true;
            }
        }

        return false;
    }
    
}


    

