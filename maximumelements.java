import java.util.*;
public class maximumelements {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=k.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxi(arr));
    }
    public static String maxi(int [] a){
        int m=a[0];
        int l=a[0];
        for(int i=1; i<a.length;i++){
            if(m<a[i]){
                m=a[i];
            }
        }
        return "The greater element in the array is "+m;
    }

}
