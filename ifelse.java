import java.util.Scanner;
public class ifelse {
    public static void main(String[]args){
        Scanner mo=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=mo.nextInt();
        if(num>0)
            System.out.println("The number is positive");
        else if (num<0)
            System.out.println("The number is Negative");
        else
            System.out.println("The number is zero");

    }
}
