import java.util.*;
public class firstrepeated {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=k.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value");
            int temp=k.nextInt();
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(repeated(arr));
    }
    public static String repeated(int [] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return "The first repeating element is: "+a[i];
                }
            }
        }
        return null;
    }
}
