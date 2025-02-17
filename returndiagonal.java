import java.util.*;
public class returndiagonal {
    public static void main(String[]args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r = k.nextInt();
        System.out.println("Enter the columns");
        int c = k.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter value");
                int temp = k.nextInt();
                arr[i][j] = temp;

            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(diagonal(arr));
    }
    public static String diagonal(int [][] a){
        ArrayList<Integer> n=new ArrayList<Integer>();
        ArrayList<Integer> m=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if((i==j)&&(i+j==a[i].length-1)){
                    m.add(a[i][j]);
                    n.add(a[i][j]);
                }
                else if (i==j){
                    n.add(a[i][j]);
                }
                else if(i+j==a[i].length-1){
                    m.add(a[i][j]);
                }
            }
        }
        return "The diagonals are "+n+" and "+m;
    }
}
