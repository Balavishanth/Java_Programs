import java.util.Scanner;
public class perfectnumber {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=k.nextInt();
        System.out.println("The sum of perfect number is: "+perfect(num));
    }
    public static int perfect(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            int s=0;
            for(int j=1;j<i;j++) {
                if (i % j == 0) {
                    s += j;
                }

                }
            if(s==i){
                sum+=1;

            }
        }
        return sum;
    }
}
