import java.util.Scanner;
public class Temperature {
    public static void main(String[]args){
        Scanner op=new Scanner(System.in);
        System.out.println("Enter the Celcius value");
        int c=op.nextInt();
        double f=(1.8*c)+32;
        System.out.println("The Fahrenheit value of the celius is: "+f);
    }
}
