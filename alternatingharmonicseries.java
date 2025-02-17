import java.util.Scanner;
public class alternatingharmonicseries {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=k.nextInt();
        k.close();
        double sum=0.0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum-(1.0/i);
            }
            else{
                sum=sum+(1.0/i);
            }
        }
        System.out.println("The value of the alternating harmonic series is: "+ sum);
    }
}
