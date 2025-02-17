import java.util.*;
public class uniqueduplicate {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = k.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value");
            arr[i] = k.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(duplicate(arr));
    }

    public static String duplicate(int a[]) {
        HashMap<Integer, Integer> uni = new HashMap<Integer, Integer>();
        for (int num : a) {
            uni.put(num, uni.getOrDefault(num, 0) + 1);
        }
        for (int key : uni.keySet()) {
            if (uni.get(key) < 2) {
                return "The Unique duplicate value in the array is: " + key;
            }
        }
        return "There is no unique duplicate value in the array";
    }
}
