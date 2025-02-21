import java.util.Scanner;

public class practice3 {
    // Write a function that toggles the case of all characters in the string and then
// print that String.
// Example

// Input:
// AbCs

// output
// aBcS
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String S=scn.nextLine();
        char[]ch=new char[S.length()];
        for(int i=0;i<S.length();i++){
            ch[i]=S.charAt(i);
        }
        toggle(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
    public static void toggle(char[]ch){
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i]=(char)(ch[i]+32);
            }
             else if(ch[i]>=97 && ch[i]<=122){
                ch[i]=(char)(ch[i]-32);
            }
             }
    }
}
