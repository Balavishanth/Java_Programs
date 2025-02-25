import java.util.*;
public class nonrepeatingchar {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=k.nextLine();
        System.out.println(non(s));
    }
    public static String non(String s){
        HashMap<Character,Integer> uni=new HashMap<>();
        char []words=s.toCharArray();
        for(Character num:words){
            uni.put(num, uni.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: uni.entrySet() ){
            if(entry.getValue()==1){
                return entry.getKey()+" ";
            }
        }
        return "Non found";
    }
}
