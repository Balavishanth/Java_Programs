import java.util.*;
class Multiple{
    int n;
    int p=1;
    String contest(){
        for(int i=1;i<=10;i++){
            p*=i;
            if(p>=n){
                if(i%2==0){
                    return n+" The one who win the contest is Micheal";
                }
                else{
                    return n+" The one who win the contest is John";
                }
            }
        }
        return "Enter a valid Number";
    }
}
public class multiplicationgameoops {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number:");
        int m=k.nextInt();
        Multiple mul=new Multiple();
        mul.n=m;
        System.out.println(mul.contest());
    }
}
