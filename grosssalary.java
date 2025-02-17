import java.util.Scanner;
public class grosssalary {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the salary of the employee: ");
        int salary=k.nextInt();
        double gross_salary=0.0;
        if(salary<=10000){
            gross_salary=gross_salary+(salary+((20.0/100)*salary)+((80.0/100)*salary));
        }
        else if(salary<=20000 && salary>10000){
            gross_salary=gross_salary+(salary+((25.0/100)*salary)+((90.0/100)*salary));
        }
        else if(salary>20000){
            gross_salary=gross_salary+(salary+((30.0/100)*salary)+((95.0/100)*salary));
        }
        System.out.println("The gross salary of the employee is : "+gross_salary);
    }
}
