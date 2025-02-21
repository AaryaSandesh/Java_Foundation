import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class practice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
       int ans= non(arr);
        System.out.print(ans);
    }
        public static int non(int[]arr){
            int N=arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<N;i++){
            if(hm.containsKey(arr[i])==true){
                int temp=hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<N;i++){
        if(hm.containsKey(arr[i])==true && hm.get(arr[i])==1){
            return arr[i];
        }
     }
      return -1;
    }
    
}