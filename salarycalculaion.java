import java.util.Scanner;
import java.util.*;
public class salarycalculaion {
    public static void main(String[]args){
            Scanner k=new Scanner(System.in);
            System.out.println("Enter the experience: ");
            int experience=k.nextInt();
            k.nextLine();
            System.out.println("Enter the degree: ");
            String graduate=k.nextLine().trim();
            System.out.println("Enter the Gender: ");
            String gender=k.nextLine().trim();
            System.out.println("The salary is:"+issalary(experience,gender,graduate));
            k.close();
    }
    public static int issalary(int ex,String gen,String gra){
        int salary=0;
        if(gen.equalsIgnoreCase("male")){
            if(gra.equalsIgnoreCase("pg")){
                if(ex>=10){
                    salary=15000;
                }
                else if(ex<10){
                    salary=10000;
                }

            }
            else if(gra.equalsIgnoreCase("gr")){
                if(ex>=10){
                    salary=10000;
                }
                else if(ex<10){
                    salary=7000;
                }
            }
        }
        else if(gen.equalsIgnoreCase("female")){
            if(gra.equalsIgnoreCase("pg")){
                if(ex>=10){
                    salary=12000;
                }
                else if(ex<10){
                    salary=10000;
                }
            }
            else if(gra.equalsIgnoreCase("gr")){
                if(ex>=10){
                    salary=9000;
                }
                else if(ex<10){
                    salary=6000;
                }
            }
        }return salary;
    }


}
