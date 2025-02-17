import java.util.*;
public class countevenandodd {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=k.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(counteo(arr));
    }
    public static String counteo(int []a){
        int e=0;
        int o=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        return "The even count in the array is "+e+" and the odd count in the array is "+o;
    }
}
