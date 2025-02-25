import java.util.Scanner;

public class SqrtN {
//     Given a non-negative integer n, return the square root of x rounded down to the nearest integer.You must not use any built-in exponent function.

// Your solution must run in O(log n) time and O(1) space.
 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
         int ans=0;
         int low=0;
            int high=(n/2)+1;
            
            while(low<=high){
              int mid=low+(high-low)/2;
                if(mid*mid==n){
                    ans=mid;
                    break;
                }
          else if(mid*mid<n){
              ans=mid; 
             low=mid+1;
            }
            else if(mid*mid>n){
                high=mid-1;
            }
            }
         System.out.print(ans) ;
    }
}
