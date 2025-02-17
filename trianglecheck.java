import java.util.Scanner;
public class trianglecheck {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the side 1: ");
        int side1=k.nextInt();
        System.out.println("Enter the side 2: ");
        int side2=k.nextInt();
        System.out.println("Enter the side 3: ");
        int side3=k.nextInt();
        System.out.println("The input triangle is : "+triangle(side1,side2,side3));
    }
    public static String triangle(int s1, int s2, int s3){
        String s="";
        if(s1<0 || s2<0 ||s3<0){
            return "Not a valid triangle";
        }
        if (s1+s2>s3 && s1+s3>s2 && s2+s3>s1){
            if(s1==s2 && s2==s3){
                s="Equilateral triangle";
            }
            else if(s1!=s2 && s2!=s3 && s1!=s3){
                s="Scalane traingle";
            }
            else if(s1==s2  || s1==s3 || s2==s3){
                s="Isosceles triangle";
            }

        }
        else{
            s="Not a valid triangle";
        }

        return s;
    }
}
