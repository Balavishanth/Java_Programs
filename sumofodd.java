import java.util.Scanner;
import java.math.*;
public class sumofodd{
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the start");
        int s=k.nextInt();
        System.out.println("Enter the end");
        int e=k.nextInt();
        k.close();
        int num=0;
        for(int i=s;i<=e;i++){
            if((isprime(i)) && (i%2!=0)){
                num+=1;
            }
        }
        System.out.println("The total odd prime number in the gap is : "+num);

    }
    public static boolean isprime(int n){
        if(n<2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

