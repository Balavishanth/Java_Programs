import java.util.*;
public class youngestandoldest {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the count of passengers");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the age");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(yoterro(arr));
    }
    public static String yoterro(int [] a){
        int m=a[0];
        int n=a[0];
        if(a.length<=1){
            return "Invalid Input";
        }
        else if(a.length==2 && ((a[0]<0)||(a[1]<0))){
            return "Invalid Input";
        }
        else {
            for (int i = 0; i < a.length; i++) {
                if (m > a[i]) {
                    m = a[i];
                }
                if (n < a[i]) {
                    n = a[i];
                }
            }

        }
        return m+" "+n;
    }
}
