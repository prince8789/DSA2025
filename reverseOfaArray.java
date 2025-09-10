import java.util.*;
public class reverseOfaArray {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array ");
        for(int i =0 ; i<n;i++){
            arr[i]= sc.nextInt();

        }
        int [] ans = ReverseArray(arr);
        for(int i =0 ; i<n;i++){
            System.out.print(ans[i]+" ");
        }
                       
        //System.out.println("the revere array is "+ReverseArray(arr));
     }
    public static int[] ReverseArray(int []arr){
        int [] ans = new int[arr.length];
        int j=0;
        for(int i = arr.length-1;i>=0;i-- ){
            ans[j++]=arr[i];
           // j++;      for this we use ans[j++] because post increment operter first execute and then incremment
        }
        return ans;

    }
    
}
