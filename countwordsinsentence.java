import java.util.ArrayList;
import java.util.Scanner;
public class countwordsinsentence {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s=k.nextLine();
        System.out.println("The number of words in the sentence is: "+words(s));
    }
    public static int words(String s){
        int w=1;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                w++;
            }
        }
        return w;
    }
}
