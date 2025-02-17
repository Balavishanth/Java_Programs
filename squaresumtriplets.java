import java.util.*;
public class squaresumtriplets {
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
        System.out.println(triplets(arr));
        k.close();
    }
    public static String triplets(int []a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    if(((a[i])!=a[k])&&(a[j]!=a[k])){
                        if ((a[i] * a[i]) + (a[j] * a[j]) == (a[k] * a[k])) {
                            return (a[i] * a[i]) + " " + (a[j] * a[j]) + " " + (a[k] * a[k]);
                        }
                    }
                }
            }
        }
        return "No such triplets";
    }
}
