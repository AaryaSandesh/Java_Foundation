// Given N array Integers, Calculate number of good integers. An element is said
// to be good integers, if {No. of element < element == element itself}

// Note: Array elements are distinct.
import java.util.*;
public class GoodIntegerDistinct {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        for (int i=0;i<N;i++){
            if( arr[i]==i){
               count++; 
            }
        }
        System.out.println(count);
    }
}