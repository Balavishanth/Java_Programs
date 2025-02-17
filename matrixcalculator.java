import java.util.*;
public class matrixcalculator {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=k.nextInt();
        System.out.println("Enter the number of columns");
        int c=k.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter value1: ");
                int temp=k.nextInt();
                arr[i][j]=temp;
            }
        }
        int brr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter value2: ");
                int temp=k.nextInt();
                brr[i][j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(brr));
        int o=k.nextInt();
        System.out.println(calculator(arr,brr,o,r,c));
    }
    public static String calculator(int a[][],int b[][], int o,int r, int c){
        int m[][]=new int[r][c];
        switch(o){
            case 1:
                if(r<=0&&c<=0){
                    return "Enter a valid value";
                }
                else {
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            m[i][j] = a[i][j] + b[i][j];
                        }
                    }
                    return "The value of the matrix addition is " + Arrays.deepToString(m);
                }
            case 2:
                if(r<=0&&c<=0){
                    return "Enter a valid value";
                }
                else {
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            m[i][j] = a[i][j] - b[i][j];
                        }
                    }
                    return "The value of the matrix subtraction is " + Arrays.deepToString(m);
                }
            case 3:
                if(r<=0&&c<=0){
                    return "Enter a valid value";
                }
                else {
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            for (int k = 0; k < c; k++) {
                                m[i][j] += a[i][k] * b[k][j];
                            }
                        }
                    }
                    return "The value of the matrix Multiplication is " + Arrays.deepToString(m);
                }
            case 4:
                if(r<=0&&c<=0){
                    return "Enter a valid value";
                }
                else {
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            m[i][j] = a[i][j] / b[i][j];
                        }
                    }
                    return "The value of the matrix division is " + Arrays.deepToString(m);
                }

        }
        return "Invalid";
    }
}
