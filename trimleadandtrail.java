import java.util.*;
public class trimleadandtrail {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=k.nextLine();
        StringBuilder w=new StringBuilder(s);
        int m=0;
        int n=w.length()-1;
        while(m<=n && w.charAt(m)==' '){
            m++;
        }
        while(n>=m && w.charAt(n)==' '){
            n--;
        }
        String ch=w.substring(m,n+1);
        System.out.println(ch);
    }
}
