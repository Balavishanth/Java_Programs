import java.util.Scanner;
import java.util.*;
public class checkforavalue {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the count of the array");
        int n=k.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println("Enter the target: ");
        int t=k.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(find(arr,t));
    }
    public static String find(int[]a,int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                return "The value is present in the array";
            }
        }return "The value is not present in the array";
    }
}
