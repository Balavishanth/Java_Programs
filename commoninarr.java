import java.util.*;
public class commoninarr {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=k.nextInt();
        int [] arr1=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter values");
            int temp=k.nextInt();
            arr1[i]=temp;
        }
        System.out.println("Enter the number of elements: ");
        int m=k.nextInt();
        int [] arr2=new int[n];
        for(int i=0;i<m;i++){
            System.out.println("Enter values");
            int temp=k.nextInt();
            arr2[i]=temp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(common(arr1,arr2));
    }
    public static String common(int [] a1, int[]a2){
        int s;
        if(a1.length>a2.length){
            s=a1.length;
        }
        else{
            s=a2.length;
        }
        int []arr=new int[s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(a1[i]==a2[j]){
                    if(Arrays.asList(arr).contains(a1[i])){
                        continue;
                    }
                    else{
                    arr[i]=a1[i];}
                }
            }
        }
        return "The common elements in two arrays are "+Arrays.toString(arr);
    }
}
