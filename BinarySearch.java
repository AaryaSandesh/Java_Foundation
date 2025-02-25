import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        boolean ans=search(arr,k);
        System.out.print(ans);
        
    }
    public static boolean search(int[] nums, int target) {
         int hi=nums.length-1;
        int low=0;
            while(low<=hi){
                int mid=low+(hi-low)/2;
                if(nums[mid]==target){
                    return true;
                }
                else if(nums[mid]>target){
                    hi=mid-1;
                }
                else if(nums[mid]<target){
                 low=mid+1;
                }
            }
            return false;
       
    }
}
