import java.util.Scanner;

public class practice6 {
//     Take as input n. Print sum of n natural numbers using recursion
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ans=sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int temp=sum(n-1);
        return temp+n;
    }
}
