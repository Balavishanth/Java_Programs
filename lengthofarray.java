import java.util.Scanner;
import java.util.*;
public class lengthofarray {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the count of the array: ");
        int l=k.nextInt();
        int[] arr = new int[l];
        for(int i=0;i<l;i++){
            int temp;
            System.out.println("Enter the value");
            temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        k.close();
        System.out.println(lengthof(arr));
    }
    public static String lengthof(int[]arr){
        int l = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            l+=1;
            sum+=arr[i];
        }
        if (l % 2 == 0) {
            return "The length of th array is: "+l+" and the sum of the array is "+sum;
        }
        else{
            return "The length of the array is: "+l+" and the avg of the array is "+(sum/l);
        }
    }
}



