import java.util.Scanner;
public class oddoreven {
    public static void main(String[]args){
        Scanner eve=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=eve.nextInt();
        if(num%2==0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
}
