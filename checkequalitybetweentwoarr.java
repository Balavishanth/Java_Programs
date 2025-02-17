import java.util.*;
public class checkequalitybetweentwoarr {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n1=k.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            System.out.println("Enter value ");
            int temp=k.nextInt();
            arr1[i]=temp;
        }
        System.out.println("Enter the number of elements: ");
        int n2=k.nextInt();
        int[] arr2=new int[n1];
        for(int i=0;i<n2;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr2[i]=temp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(equality(arr1,arr2));
    }
    public static String equality(int [] a1, int [] a2){
        if(a1.length>a2.length || a1.length<a2.length){
            return "The two arrays are not equal";
        }
        else{
            for(int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    return "The two arrays are not equal";
                }
            }return "The arrays are equal";
        }
    }
}
