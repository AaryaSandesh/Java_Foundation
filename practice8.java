import java.util.Scanner;
// printing decreasing numbers using recursion
public class practice8 {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        dec(n);
    }
    public static void dec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        dec(n-1);
    }
}
