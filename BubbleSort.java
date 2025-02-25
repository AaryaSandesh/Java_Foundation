// Bubble Sort
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<N-1;i++){//for iterations --fixing N-1 elements ,Nth will be fixed automatically
            for (int j=0;j<N-1-i;j++){// i because that many numbers are sorted from last
             if(arr[j]>arr[j+1]){
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
                
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
