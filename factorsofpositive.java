import java.util.Scanner;
import java.util.ArrayList;
public class factorsofpositive {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the range: ");
        int num=k.nextInt();
        System.out.println("The factors of the numbers are: "+factor(num));
    }
    public static ArrayList<Integer> factor(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(n%i==0){
                arr.add(i);

            }
        }
        return arr;
    }
}
