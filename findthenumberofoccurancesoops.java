import java.util.*;
class occurance{
    String s;
    char v;
    String count(){
        char[] words=s.toCharArray();
        HashMap<Character, Integer> uni = new HashMap<>();
        for(Character num:words){
            uni.put(num, uni.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: uni.entrySet()){
            if(entry.getKey()==v){
                return "The total number of times the char repeated is : "+entry.getValue()+" ";
            }
        }
        return "Enter a valid Input";
    }
}
public class findthenumberofoccurancesoops {
    public static void main(String[]args){
           occurance occur=new occurance();
           occur.s="im luffy im gonna become king of the pirates";
           occur.v='i';
           System.out.println(occur.count());
    }
}
