import java.util.*;
public class hammingdistance {
    public static  void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s=k.nextLine();
        System.out.println("Enter string 2");
        String t=k.nextLine();
        if(s.length()==0 && t.length()==0){
            System.out.println("Enter a valid input");
            return;
        }
        if(s.length()==t.length()) {
            Set<Character> uni = new LinkedHashSet<>();
            for (char i : s.toCharArray()) {
                uni.add(i);
            }
            Character[] un = uni.toArray(new Character[0]);
            char[] result = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == un[0]) && (t.charAt(i) == un[0])) {
                    result[i] = un[1];
                } else if ((s.charAt(i) == un[1]) && (t.charAt(i) == un[1])) {
                    result[i] = un[0];
                } else if ((s.charAt(i) == un[0]) && (t.charAt(i) == un[1])) {
                    result[i] = un[0];
                } else if ((s.charAt(i) == un[1]) && (t.charAt(i) == un[0])) {
                    result[i] = un[1];
                }
            }
            String res = new String(result);
            System.out.println(res);
        }
        else{
            System.out.println("The length of the String must be same");
        }

    }
}
