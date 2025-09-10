import java.util.*;
public class palindrome{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the element");
    int n = sc.nextInt();
    int rem =0;
    int num = n;
    if(n<0){
        System.out.println("the given number is not palindrome");
    }
    else{
        while(n>0){
           
            num = rem*10+rem;
            rem = n%10;
            n= n/10;
        }
        if(rem == num){
            System.out.println("the given number is palindrome");
        }
        else{
            System.out.println("the given number is not palindrome");
        }
    }

    }
}