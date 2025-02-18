import java.util.*;
public class averageageinrow {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=k.nextInt();
        System.out.println("Enter the number of columns");
        int c=k.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter age");
                arr[i][j]=k.nextInt();
            }
        }
        System.out.println("Enter the target age");
        int x=k.nextInt();
        System.out.println(Arrays.deepToString(arr));
        System.out.println(avgage(arr,r,c,x));
    }
    public static String avgage(int a[][], int r, int c, int x){
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<r;i++){
            int avg=0;
            for(int j=0;j<c;j++){
                avg+=a[i][j];
            }
            b.add(avg/c);
        }
        int count=0;
        for(int i=0;i<b.size();i++){
            if(b.get(i)>x){
                count++;
            }
        }
        return "The average age that is greater than x is: "+count;
    }
}
