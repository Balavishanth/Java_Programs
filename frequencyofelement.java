import java.util.*;
public class frequencyofelement {
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
        System.out.println(frequency(arr));
        k.close();
    }
    public static String frequency(int []a){
        HashMap<Integer, Integer> b=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(b.containsKey(a[i])){
                b.put(a[i],b.get(a[i])+1);
            }
            else{
                b.put(a[i],1);
            }
        }return "The frequency of every element in the array is: "+b;
    }
}
//another method to do it by sorting the array and then compare
