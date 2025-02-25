import java.util.*;
public class wordcountremove {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = k.nextLine();
        System.out.println("Enter the number");
        int t = k.nextInt();
        String[] st = s.split(" ");
        HashMap<String, Integer> uni = new HashMap<>();
        for (String num : st) {
            uni.put(num, uni.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : uni.entrySet()) {
            if (entry.getValue() > t) {
                System.out.println(entry.getKey());
            }

        }
    }
}

