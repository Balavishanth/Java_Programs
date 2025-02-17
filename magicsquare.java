import java.util.*;
public class magicsquare {
    public static void main(String[]args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = k.nextInt();
        System.out.println("Enter the number of column");
        int c = k.nextInt();
        if (r != c) {
            System.out.println("Enter a valid n*n for magic matrix");
        } else {
            int arr[][] = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.println("Enter value");
                    int temp = k.nextInt();
                    arr[i][j] = temp;
                }
            }
            System.out.println(Arrays.deepToString(arr));
            System.out.println(magik(arr,r,c));
        }
    }
    public static String magik(int a[][],int r, int  c) {
        int rsum=0;
        int csum=0;
        int d1sum=0;
        int d2sum=0;
        String s="";
        int x[]=new int[r];
        int y[]=new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                rsum+=a[i][j];
                x[i]=rsum;
                if((i==j)&&(i+j==c-1)){
                    d1sum+=a[i][j];
                    d2sum+=a[i][j];

                }
                else if(i==j){
                    d1sum+=a[i][j];
                }
                else if(i+j==c-1){
                    d2sum+=a[i][j];
                }
            }
            rsum=0;
        }
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                csum+=a[i][j];
            }
            y[j]=csum;
            csum=0;
        }

        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                if((x[i]!=x[j])||(y[i]!=y[j])||(d1sum!=d2sum)){
                    s="Not a Magic matrix";
                    break;
                }
                else if((x[i]==y[i])&&(y[i]==d1sum)&&(d1sum==d2sum)){
                    s="It is a Magic Matrix";
                }
            }
        }
        return s;
    }
}