import java.util.Scanner;
import java.util.Arrays;
public class findthindex {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=k.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println("Enter the target");
        int t=k.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(findindex(arr,t));
        k.close();
    }
    public static String findindex(int[] a, int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
            return "The index of the target is "+i;}
        }
        return "Enter a valid target";
    }
}
