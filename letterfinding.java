import java.util.*;
public class letterfinding {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=k.nextInt();
        System.out.println((char)recur(n));
    }
    public static int recur(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        if(sum>26){
            recur(sum);
        }
        sum+=64;
        return sum;
    }
}
