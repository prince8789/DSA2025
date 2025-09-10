import java.util.*;
public class queryOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int [] frArr = new int [1000000];
        for(int i =0;i<n;i++){
            frArr[arr[i]]++;
        }
        System.out.println("enter the number of query ");
        int q =sc.nextInt();
        while(q>0){
            System.out.println("enter the target");
            int target = sc.nextInt();
            if(frArr[target]>0){
                System.out.println("the given element is present");
            }
            else{
                System.out.println("the given element is not present");
            }
            q--;

        }

    }

    
}
