import java.util.*;
public class secondnonrepeative {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=k.nextLine();
        System.out.println(non2(s));
    }
    public static String non2(String s){
        HashMap<Character, Integer> uni=new HashMap<>();
        char[] words=s.toCharArray();
        for(Character num:words){
            uni.put(num, uni.getOrDefault(num,0)+1);
        }
        int count=0;
        for(Map.Entry<Character, Integer> entry: uni.entrySet()){
            if(entry.getValue()==1 && count==0){
                count++;
            }
            else if(entry.getValue()==1 && count==1){
                return entry.getKey()+" ";
            }
        }
        return "Non found";
    }
}
