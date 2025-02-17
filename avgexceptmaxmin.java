import java.util.*;
public class avgexceptmaxmin {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(avgmm(arr));
        k.close();
    }
    public static String avgmm(int [] a){
        int m=a[0];
        int n=a[0];
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(m<a[i]){
                m=a[i];
            }
            else if(n>a[i]){
                n=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==m || a[i]==n){
                continue;
            }
            else{
                sum+=a[i];
            }
        }return "The avg of the array without the max and min: "+(sum/(a.length-2));
    }
}
