import java.util.*;
public class sumoflower {
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
                arr[i][j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(lower(arr,r,c));
        k.close();
    }
    public static String lower(int [][]a,int r,int c){
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=a[i][j];
                }
                else if(i>j){
                    sum+=a[i][j];
                }
            }
        }
        return "The sum of the lower triangle is: "+sum;
    }

}
