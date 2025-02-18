import java.util.*;
public class substringofanarray {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=k.nextInt();
        System.out.println("Enter the number of sub elements");
        int m=k.nextInt();
        int nn[]=new int[n];
        int mm[]=new int [m];
        for(int i=0;i<n;i++){
            System.out.println("Enter value n");
            nn[i]=k.nextInt();
        }
        for(int i=0;i<m;i++){
            System.out.println("Enter value m");
            mm[i]=k.nextInt();
        }
        System.out.println(Arrays.toString(nn));
        System.out.println(Arrays.toString(mm));
        System.out.println(sub(nn,mm));
    }
    public static String sub(int a[], int []b){
        String s="";
        String t="";
        for(int num:a){
            s+=num;
        }
        for(int num:b){
            t+=num;
        }
        if(s.contains(t)){
            return "Yes";
        }
        return "No";
    }

}
