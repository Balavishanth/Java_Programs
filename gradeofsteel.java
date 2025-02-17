import java.util.Scanner;
public class gradeofsteel {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the hardness of the steel: ");
        int hard=k.nextInt();
        System.out.println("Enter the carbon content in the steel");
        float carbon=k.nextFloat();
        System.out.println("Enter the tensile strength of the steel");
        long tensile=k.nextLong();
        System.out.println("The grade of the steel is: "+grading(hard,carbon,tensile));
    }
    public static int grading(int h,float c,long t){
        if(h>50 && c<0.7 && t>5600){
            return 10;
        }
        else if(h>50 && c<0.7){
            return 9;
        }
        else if(c<0.7 && t>5600){
            return 8;
        }
        else if(h>50 && t>5600){
            return 7;
        }
        else if(h>50 || c<0.7 || t>5600){
            return 6;
        }
        else{
            return 5;
        }
    }
}
