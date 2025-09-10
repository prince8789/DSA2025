import java.util.*;
public class rotateArrayKthTime {
         public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the value of k ");
        int k = sc.nextInt();
        System.out.println("Rotated array is ");
        int [] ans = RotatedArray(arr, k);
        for(int i =0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

    public static int [] RotatedArray(int []arr ,int k){
        k=k%arr.length;
        while(k>0){
            //int temp = arr[arr.length-1];
            for(int i =arr.length-1;i>0;i--){
               // arr[i]=arr[i-1];
                
                 int swap = arr[i];
                 arr[i]=arr[i-1];
                 arr[i-1]= swap;
            }
           // arr[0]=temp;
            k--;
        }
        return arr;
        
    }
    
}
