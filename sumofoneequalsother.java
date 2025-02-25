import java.util.*;
public class sumofoneequalsother {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=k.nextLine();
        System.out.println(equal(s));
    }
    public static String equal(String s){
        HashMap<Character, Integer> uni = new HashMap<>();
        for(char i : s.toCharArray()){
            uni.put(i,uni.getOrDefault(i,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int freq=0;
        int total=0;
        for (Map.Entry<Character, Integer> entry : uni.entrySet()) {
            total+=entry.getValue();
            if (entry.getValue() > max) {
                max = entry.getValue();
                freq = entry.getKey();
            }
        }
        if(max==total-max){
            return "yes";
        }
        return "No";

    }
}
