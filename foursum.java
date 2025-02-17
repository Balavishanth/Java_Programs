import java.util.*;
public class foursum {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target: ");
        int t=k.nextInt();
        System.out.println(four(arr,t));
        k.close();
    }
    public static String four(int a[], int t){
        String sum="";
        for(int i=0;i<a.length-3;i++){
            for(int j=i+1;j<a.length-2;j++){
                for(int k=j+1;k<a.length-1;k++){
                    for(int l=k+1;l<a.length;l++){
                            if(a[i]+a[j]+a[k]+a[l]==t){
                                return "The target is found";
                            }
                    }
                }
            }
        }
        return "The target is not found";
    }
}
