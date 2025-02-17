import java.util.Scanner;
public class sumandavg {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        int s=0;
        for(int i=0;i<=5;i++){
            System.out.println("Enter the number");
            int temp=k.nextInt();
            s+=temp;
        }
        System.out.println("The sum of the value: "+s);
        System.out.println("The avg of the sum value :"+(float)s/5);


    }
}
