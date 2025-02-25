import java.util.*;

interface guts{
    public void sort(int arr[]);
}

class frontmove implements guts{
    public void sort(int arr[]){
        int a=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    a++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        if(a==0){
            System.out.println(0);
        }
        else if(arr.length>a){
            System.out.println(arr.length-a);
        }
        else{
            System.out.println(a-arr.length);
        }
    }
}

public class minimumfrontmoves {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the length");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            arr[i]=k.nextInt();
        }
        frontmove f= new frontmove();
        f.sort(arr);
    }
}
