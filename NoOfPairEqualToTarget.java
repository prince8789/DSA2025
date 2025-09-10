
import java.util.*;

public class NoOfPairEqualToTarget {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        int c = totalPair(arr, target);
        System.out.println("the number of pair is "+c);
        //System.out.println(c);
    }
    public static int totalPair(int [] num , int target){
        int count =0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    count++;
                }
            }

        }
        return count;
    }
    
}
