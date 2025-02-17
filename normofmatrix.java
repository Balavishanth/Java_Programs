import java.util.*;
public class normofmatrix {
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
                int temp=k.nextInt();
                temp=Math.abs(temp);
                arr[i][j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(norm(arr,r,c));
    }
    public static String norm(int a[][],int r, int c){
        int sum=0;
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
               sum+=a[i][j]*a[i][j];
            }
        }
        return "The norm of the matrix is: "+Math.sqrt(sum);
    }
}
