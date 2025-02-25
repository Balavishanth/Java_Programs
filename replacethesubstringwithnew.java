import java.util.*;
public class replacethesubstringwithnew {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the main string");
        String s=k.nextLine();
        System.out.println("Enter the substring");
        String m=k.nextLine();
        System.out.println("Enter the replacing string");
        String n=k.nextLine();
        if(Arrays.asList(m).contains(m)){
            String t=s.replace(m,n);
            System.out.println(t);
        }
        else{
            System.out.println("The substring is not found");
        }

    }
}
