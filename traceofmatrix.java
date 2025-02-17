import java.util.*;
public class traceofmatrix {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=k.nextInt();
        System.out.println("Enter the number of columns");
        int c=k.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter value");
                arr[i][j]=k.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(trace(arr,r,c));
    }
    public static String trace(int [][]a,int r,int c){
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        return "The trace of the matrix is: "+sum;
    }
}
