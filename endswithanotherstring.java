import java.util.*;
public class endswithanotherstring {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter string 1");
        String m = k.nextLine();
        System.out.println("Enter string 2");
        String n = k.nextLine();
        System.out.println(laststring(m, n));
    }
    public static String laststring(String m, String n){
        int i=n.length()-1;
        int j=m.length()-1;
        int c=0;
        int k=0;
        while (k<n.length()){
            if(n.charAt(i)==m.charAt(j)){
                c++;
                k++;
                i--;
                j--;
            }
            else if((c>0) && (n.charAt(i)!=m.charAt(j))){
                break;
            }
        }
        if(c==n.length()){
            return "It does ends with the string";
        }
        return "It does not ends with the string";
    }
}