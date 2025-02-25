import java.util.Scanner;

public class BinarySearchFloor {
     Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        int high=n-1;
        int low=0;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=arr[mid];
                break;
            }
            else if(arr[mid]>k){
                high = mid - 1; 
                
            }
            else{
                 ans = arr[mid];
                low=mid+1;
            }
        }
        System.out.print(ans);
    }

