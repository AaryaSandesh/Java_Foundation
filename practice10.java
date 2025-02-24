import java.util.Scanner;

public class practice10 {
    // Take an input N, the size of array.
    // Take N more inputs and store that in an array.
    
    // 1.It reads a number N.
    // 2.Take Another N numbers as input and store them in an Array.
    
    // Write a recursive function which returns true if the array is sorted and false
    // otherwise
    
    // print returned value.
    
    
    // Example(To be used only for expected output):
    // Input:
    // 4
    // 2 8 6 4
    // Output:
    // false 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int[]arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        boolean ans=issorted(arr,0,1,arr.length-1);
        System.out.println(ans);
    }
    public static boolean issorted(int[]arr,int sp,int ep,int n){
        if(ep==n && arr[sp]<arr[ep]){
            return true;
        }
        else if(ep==n && arr[sp]>=arr[ep]){
            return false;
        }
        if(arr[sp]<arr[ep]){
           boolean temp= issorted(arr,sp+1,ep+1,n);
            return temp;
        }
        else{
            return false;
        }
    }
}
