import java.util.*;
public class secondLargest { 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        if(n < 2){
            System.out.println("Array should have at least 2 elements");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("No second largest element found (all elements may be same)");
        } else {
            System.out.println("The second largest element is " + secondLargest);
        }
    }
}

