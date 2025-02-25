import java.util.*;
public class substring {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter string 1");
        String m=k.nextLine();
        System.out.println("Enter string 2");
        String n=k.nextLine();
        System.out.println(substring(m,n));
    }
    public static String substring(String m, String n){
        int i=0;int j=0;
        int k=0;
        int c=0;
        while(k<n.length()){
            if (n.charAt(i)==m.charAt(j)){
                c++;
                k++;
                i++;
                j++;
            }
            else if((c==0) && (n.charAt(i)!=m.charAt(j))){
                j++;
            }
            else if((c>0) && (c!=n.length()) && (n.charAt(i)!=m.charAt(j))){
                break;
            }
        }
        if(c==n.length()){
            return "It is a substring";
        }
        return "It is not a substring";
    }
}
