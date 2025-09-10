import java.util.*;
public class firstRepeted {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
           
        }
        int ans = Firstoccurance(arr);
        System.out.println(ans);


     }
     public static int Firstoccurance(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }

            }
        }
        return -1;

     }
}
