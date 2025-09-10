
import java.util.*;
public class transposeOfMatrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        transposewithoutextraSpace(arr, row, col);
        //int [][]ans=Transpose(arr,row,col);
        System.out.println("transpose of matrix is ");
        print2dArray(arr);

    }
    // static int[][] Transpose(int [][]arr,int row,int col){
    //     int [][] ans = new int[col][row];
    //     for(int i =0;i<col;i++){
    //         for(int j =0;j<row;j++){
    //             ans[i][j]=arr[j][i];
    //         }
    //     }
    //     return ans;
    // }
    static void transposewithoutextraSpace(int [][]arr, int row,int col){
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
  
     static void print2dArray(int [][]arr){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
