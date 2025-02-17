import java.util.Scanner;
public class Righttriangle2 {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int c=k.nextInt();
        int n=1;
        for(int i=1;i<=c;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+++"\t");
            }
            System.out.println();
        }
    }
}
