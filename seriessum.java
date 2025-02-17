import java.util.Scanner;
public class seriessum {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=k.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum=sum+(1.0/i);
        }
        System.out.println("The sum value of the series is: "+sum);
    }
}
