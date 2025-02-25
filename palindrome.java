import java.util.*;
public class palindrome {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=k.nextLine();
        System.out.println(palin(s));
    }
    public static String palin(String s){
        int i =0;
        int j=s.length()-1;
        while(i>j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return "It is not a palindrome";
            }
        }
        return "It is a palindrome";
    }
}
