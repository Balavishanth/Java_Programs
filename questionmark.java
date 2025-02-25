import java.util.*;
public class questionmark {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1=k.nextLine();
        System.out.println("Enter the string 2");
        String s2=k.nextLine();
        System.out.println(device(s1,s2));
    }
    public static String device(String a, String b){
        int s1s=0;
        int s2s=0;
        int count=0;
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='?'){
                    s1s++;
                }
                if(b.charAt(i)=='?'){
                    s2s++;
                }
            }
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==b.charAt(i)){
                    count++;
                }
                else if((a.charAt(i)=='?') || (b.charAt(i))=='?'){
                    count++;
                }
                else{
                    return "No";
                }
            }
            if(s1s==s2s && count==a.length()){
                return "Yes";
            }
        }
        return "No";
    }
}

