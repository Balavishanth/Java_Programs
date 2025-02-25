import java.util.*;
public class keyvaluecount {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=k.nextLine();
        System.out.println(capgemini(s));
    }
    public static String capgemini(String s){
        HashMap<Character, Integer> uni=new HashMap<>();
        String t="";
        char[] words=s.toCharArray();
        for(Character num: words){
            uni.put(num,uni.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Character, Integer> entry: uni.entrySet()){
            t+=entry.getKey();
            t+=entry.getValue();
        }
        return t;
    }
}
