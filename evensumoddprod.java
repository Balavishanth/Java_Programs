import java.util.*;
public class evensumoddprod {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(evenodd(arr));
    }
    public static String evenodd(int a[]){
        int sum=0;
        int pro=1;
        String s="";
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            pro*=a[i];
        }
        if(sum%2==0){
            s="The sum is "+sum;
        }
        else{
            s="The product is "+pro;
        }
        return s;
    }
}
