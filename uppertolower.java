import java.util.*;
public class uppertolower {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = k.nextLine();
        StringBuilder v = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                v.setCharAt(i, (char) (ch + 32));
            }
        }
        System.out.println(v);
    }
}

