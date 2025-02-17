import java.util.*;
public class copyelementsarrtoarr {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=k.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value: ");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(clone(arr));
    }
    public static String clone(int[] a){
        int k[]=new int[a.length];
        for(int i=0;i<k.length;i++){
            k[i]=a[i];
        }return "The clone of the given array is "+Arrays.toString(k);
    }
}
