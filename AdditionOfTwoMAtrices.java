import java.util.*;
public class AdditionOfTwoMAtrices {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AdditionOfTwoMAtrices obj = new AdditionOfTwoMAtrices();
        int [][]arr1 = obj.input2DArray();
        int [][]arr2 = obj.input2DArray();
        int [][] answer = obj.SumofMatrix(arr1,arr2);
        System.out.println("the sum of given two array is ");
        obj.print2dArray(answer);
        
    }
    int[][] input2DArray(){
        System.out.println("enter the number of row");
        int row = sc.nextInt();
        System.out.println("enter the number of column ");
        int col = sc.nextInt();
        int [][]arr = new int[row][col];
        System.out.println("enter the "+row*col+"elements");
        for(int i = 0 ;i< row; i++){
            for(int j =0 ; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;

    }
    int [][] SumofMatrix(int [][]arr1,int [][] arr2){
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int row2 = arr2.length;
        int col2 = arr2[0].length;
        int [][]ans = new int[row1][col1];
        if(row1==row2 && col1==col2){
            for(int i = 0 ;i< row1; i++){
                for(int j =0 ; j<col1; j++){
                    ans[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            return ans;
        }
        else{
            System.out.println("the matrix daminsion is not match ");
            return null;
        }
   
    }
    void print2dArray(int [][]arr){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
}
