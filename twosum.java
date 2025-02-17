import java.util.*;
public class twosum {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=k.nextInt();
        int  [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter target");
        int t=k.nextInt();
        System.out.println(sum(arr,t));
        k.close();
    }
    public static String sum(int [] a, int t){
        String s="";
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    s="Array has two elements with given sum "+a[i]+" "+a[j];
                }
            }
        }return s;
    }
}
