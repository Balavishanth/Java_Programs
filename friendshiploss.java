import java.util.*;
public class friendshiploss {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of friends");
        int n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the dates they choose");
            arr[i]=k.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(party(arr));
    }
    public static String party(int a[]){
        HashSet<Integer> dates=new HashSet<>();
        for(int num:a){
            if(dates.contains(num)){
                continue;
            }
            else{
                dates.add(num);
            }
        }
        return "The number of friendships he can maintain is: "+dates.size();
    }

}

