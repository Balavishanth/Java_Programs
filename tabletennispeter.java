import java.util.*;
public class tabletennispeter {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the binary String");
        String s=k.nextLine();
        int win=0;
        int lose=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                lose++;
            }
            else if(s.charAt(i)=='1'){
                win++;
            }
            else{
                System.out.println("Invalid input");
                return;
            }
        }
        if(lose>win){
            System.out.println("Lose");
        }
        else if(lose==win){
            System.out.println("Match Draw");
        }
        else{
            System.out.println("Win");
        }
    }
}
