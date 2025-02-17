import java.util.*;
public class indexofmmatrix {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=k.nextInt();
        System.out.println("Enter the number of columns: ");
        int c=k.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter value: ");
                arr[i][j]=k.nextInt();
            }
        }
        System.out.println("Enter the target: ");
        int t=k.nextInt();
        System.out.println(Arrays.deepToString(arr));
        System.out.println(index(arr,r,c,t));
    }
    public static String index(int a[][], int r, int c, int t){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==t){
                    return "The indexes are: "+i+" "+j;
                }
            }
        }
        return null;
    }
}
