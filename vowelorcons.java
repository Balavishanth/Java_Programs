import java.util.Scanner;
public class vowelorcons {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        char c=k.next().charAt(0);
        char [] a={'a','e','i','o','u','A','E','I','O','U'};
        boolean n=false;
        for(int i=0;i<a.length;i++){
            if (c ==a[i]){
                System.out.println("The input is Vowel: "+c);
                n=true;
            }
            }
        if(n==false){
            System.out.println("The input is consonent: "+ c);
        }

        }
        }

