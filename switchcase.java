import java.util.Scanner;
public class switchcase {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number a");
        int a=k.nextInt();
        System.out.println("Enter the number b");
        int b=k.nextInt();
        System.out.println("1-add;2-sub;3-mul;4-div;5-rem");
        System.out.println("Enter the option");
        int o=k.nextInt();
        switch(o){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
