import java.util.*;
public class medianofarr {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(median(arr));
    }
    public static String median(int []a){
        String med="";
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp;
                    temp=a[i];
                    a[j]=a[i];
                    a[j]=temp;
                }
            }
            if(a.length%2==0){
                med= "The median is "+(a[((a[(a.length/2)-1])+a[a.length/2])/2]);
            }
            else{
                med= "The median is "+(a[a.length/2]);
            }
        }return med;
    }
}
