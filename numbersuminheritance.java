import java.util.*;

interface kuttu{
    public void add();
}

class sum implements kuttu{
    int num;
    int n=0;
    ArrayList<Integer> arr=new ArrayList<>();
    public void add(){
        while(num>0){
            int rem=num%10;
            arr.add(rem);
            num=num/10;
        }
        for(int j=0;j<arr.size();j++){
            for(int k=j+1;k<arr.size();k++){
                n+=arr.get(j)+arr.get(k);
            }
        }
        System.out.println(n);
    }
}
public class numbersuminheritance {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number");
        int h=k.nextInt();
        sum s= new sum();
        s.num=h;
        s.add();
    }
}
