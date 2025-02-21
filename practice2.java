import java.util.Scanner;

public class practice2 {
    // Given a 2D array, Print integers in zig zag fashion.
// Note: Zig zag fashion means oth row from left to right, 1st row form right to left, 2nd row from left to right and so on 
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();//row
        int m=scn.nextInt();//column
        int[][]arr=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              arr[i][j]=scn.nextInt();  
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            if(i%2!=0){
                for(int j=m-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
