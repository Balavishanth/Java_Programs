import java.util.*;
public class sort2arrays {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            arr[i]=k.nextInt();
        }
        System.out.println("Enter the number of elements 2");
        int m=k.nextInt();
        int brr[]=new int[m];
        for(int i=0;i<m;i++){
            System.out.println("Enter value 2");
            brr[i]=k.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        System.out.println(merge(arr,brr));
        k.close();
    }
    public static String merge(int a[],  int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]>b[0]){
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
            }
            int c=b[0];
            for(int j=1;j<b.length;j++){
                if(b[j]<c){
                    b[j-1]=b[j];
                }
                c=b[j];
            }
        }
        return "Thee sorted arrays are : "+(Arrays.toString(a))+" "+(Arrays.toString(b));
    }
}
