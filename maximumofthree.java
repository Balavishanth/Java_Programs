import java.util.Scanner;
public class maximumofthree {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a=k.nextInt();
        System.out.println("Enter the number b:");
        int b=k.nextInt();
        System.out.println("Enter the number c:");
        int c=k.nextInt();
        if(a>b && a>c){
            System.out.println("A is the greatest");
        }
        else if(b>a && b>c){
            System.out.println("B is the greatest");
        }
        else{
            System.out.println("C  is the greatest");
        }

    }
}
