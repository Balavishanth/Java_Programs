import java.util.*;
public class normalnumberofarr {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = k.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value");
            int temp = k.nextInt();
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(normal(arr));
    }

    public static String normal(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = a[i] * a[i];
            sum += temp;
        }
        return "The normal number of the array is: " + (Math.sqrt(sum));
    }
}
