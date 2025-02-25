import java.util.*;
public class minimalandmaximaldifference {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the string 1");
        String a=k.nextLine();
        System.out.println("Enter the string 2");
        String b=k.nextLine();
        int min=0;
        int max=0;
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i) && (a.charAt(i)!='?' && b.charAt(i)!='?')){
                    min++;
                    max++;
                }
                if((a.charAt(i)=='?' || b.charAt(i)=='?')){
                    max++;
                }
                else if((a.charAt(i)=='?' && b.charAt(i)=='?')){
                    max++;
                }
            }
        }
        System.out.println(min+" "+max);
    }
}

