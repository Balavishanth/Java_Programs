import java.util.Scanner;
public class countcharinstring {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=k.nextLine();
        k.close();
        System.out.println("The number of char in a string is: "+count(s));
    }
    public static int count(String s){
        s=s.replaceAll(" ","");
        int sum=0;
        for(int i=0;i<=s.length()-1;i++){
            sum+=1;
        }return sum;
    }
}
