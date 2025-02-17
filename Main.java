import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner inn= new Scanner(System.in);
        System.out.println("Enter the length");
        int len= inn.nextInt();
        System.out.println("Enter the breath");
        int bre=inn.nextInt();
        int area=len*bre;
        System.out.println("The Area of Rectangle is :"+ area);
    }
}