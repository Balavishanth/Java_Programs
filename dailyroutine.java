import java.util.*;
public class dailyroutine {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        String s=k.nextLine().toLowerCase();
        for(int i=0;i<s.length()-1;i++){
            if((i==0) && (s.charAt(i)!='c')){
                System.out.println("No");
                return;
            }
            else if(s.charAt(i)=='c' && s.charAt(i+1)=='c'){
                continue;
            }
            else if(s.charAt(i)=='c' && s.charAt(i+1)=='e'){
                continue;
            }
            else if(s.charAt(i)=='e' && s.charAt(i+1)=='e'){
                continue;
            }
            else if(s.charAt(i)=='e' && s.charAt(i+1)=='s'){
                continue;
            }
            else if(s.charAt(i)=='s' && s.charAt(i+1)=='s'){
                continue;
            }
            else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
