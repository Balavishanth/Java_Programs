import java.util.*;
public class countnumberofpossibletriangles {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            arr[i]=k.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(triangle(arr));
    }
    public static String triangle(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]>=a[k]){
                        count++;
                    }
                }
            }
        }
        return "The number of possible triangles from an arrays is: "+count;
    }
}
