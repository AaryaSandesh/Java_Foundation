import java.util.Scanner;
import java.util.function.Function;

public class practice9 {
//     Take as input String.

// Write a Function to Check whether it is palindrome or not. if yes print true
// otherwise false. Palindrome means string and it's reversed form are same

// please Note: Lower and Upper case letter treated as equal. You have to use recursion to solve the problem.
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scn=new Scanner(System.in);
    String st=scn.nextLine();
    StringBuilder s=new StringBuilder(st);
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase manually
            s.setCharAt(i, ch);  // Set the modified character
        }
    }
        boolean flag=isPalin(s,0,s.length()-1);
        System.out.println(flag);
    
}
public static boolean isPalin(StringBuilder s,int sp,int ep){
    if(sp>=ep){
        return true;
    }
    if(s.charAt(sp)==s.charAt(ep)){
        boolean temp=isPalin(s,sp+1,ep-1);
        return temp;
    }
    else{
        return false;
    }    
}
}