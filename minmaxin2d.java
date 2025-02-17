import java.util.*;
public class minmaxin2d {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r=k.nextInt();
        System.out.println("Enter the number of columns");
        int c=k.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter value");
                int temp=k.nextInt();
                arr[i][j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(minmax(arr,r,c));
    }
    public static String minmax(int a[][], int r, int c){
        int min=a[0][0];
        int max=a[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
                else if(a[i][j]<min){
                    min=a[i][j];
                }
            }
        }
        return min+" "+max;

    }}

