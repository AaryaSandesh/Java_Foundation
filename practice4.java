import java.util.HashSet;
import java.util.Scanner;

public class practice4 {
    // Given an array arr[] of length N, The task is to count all distinct elements in arr[].
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
