import java.util.Scanner;
public class Righttriangle {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the count:");
        int n=k.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
