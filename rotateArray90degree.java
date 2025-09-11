import java.util.Scanner;

public class rotateArray90degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is valid for square matrix only");
        System.out.println("enter the number of row");
        int row = sc.nextInt();
        System.out.println("enter the number of column ");
        int col = sc.nextInt();
        int [][]arr = new int[row][col];
        System.out.println("enter the "+row*col+" elements");
        for(int i = 0 ;i< row; i++){
            for(int j =0 ; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transposeInplace(arr, row, col);
            for (int i = 0; i < row; i++) {
                ReverseArray(arr[i]);
        }
        System.out.println("the rotated array is ");
        print2dArray(arr);
    }
     static void transposeInplace(int [][]arr, int row,int col){
      if(row!=col){
        System.out.println("enter the square matrix");
        return;
      }
      else{
          for(int i =0;i<row;i++){
            for(int j =i+1;j<col;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
      }

    }
        static int[] ReverseArray(int []arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
        return arr;
    }
    static void print2dArray(int [][]arr){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    
}
