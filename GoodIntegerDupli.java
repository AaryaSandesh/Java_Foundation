// Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

// Note: Array elements can be duplicate.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GoodIntegerDupli {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        int leastcount=0;
        if(arr[0]==0){
            count++;
        }
        for(int i=1;i<N;i++){
            if(arr[i]!=arr[i-1]){
              leastcount=i;  
            }
        if(arr[i]==leastcount){
           count++;
        }
        }
        System.out.println(count);
    }
}