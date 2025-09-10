import java.util.*;
public class swaptwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        swapWithoutTemp(a, b);
        swapWithTemp(a, b);
        
    }
    public static void swapWithoutTemp(int a ,int b){
        b= a+b;
        a=b-a;
        b=b-a;

        System.out.println("value after swap");
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);

        
    }
        public static void swapWithTemp(int l ,int m){
        int temp = l;
        l = m;
        m = temp;
        System.out.println("value after swap");
        System.out.println("the value of a is "+l);
        System.out.println("the value of b is "+m);

        
    }
    
    



    
}
