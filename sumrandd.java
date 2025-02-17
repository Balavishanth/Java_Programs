import java.util.*;
public class sumrandd {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the rows");
        int r=k.nextInt();
        System.out.println("Enter the columns");
        int c=k.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter value");
                int temp=k.nextInt();
                arr[i][j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(randcsum(arr,r,c));
    }
    public static String randcsum(int [][]a,int m, int n){
        int rsum=0;
        int csum=0;
        int r[]=new int[a.length];
        int c[]=new int[a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                rsum+=a[i][j];
                r[i]=rsum;
            }
            rsum=0;
        }
        for(int j=0;j<n;j++){
            csum=0;
            for(int i=0;i<m;i++){
                csum+=a[i][j];
                c[j]=csum;
            }
        }
        return "The row sum is "+Arrays.toString(r)+" and the column sum is "+Arrays.toString(c);
    }
}
