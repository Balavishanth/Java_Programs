import java.util.Scanner;
public class threeequal {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number A");
        int a=k.nextInt();
        System.out.println("Enter the number B");
        int b=k.nextInt();
        System.out.println("Enter the number C");
        int c=k.nextInt();
        if((a==b)&& (a==c)){
                System.out.println("The three numbers are equal");
        }
        else if(a==b){
            System.out.println("A and B are equal");
        }
        else if(a==c){
            System.out.println("A and C are equal");
        }
        else if(b==c){
            System.out.println("B and C are equal");
        }
        else{
            System.out.println("All three are distinct");
        }
    }
}
