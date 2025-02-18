import java.util.*;
public class filmfestival {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of movies: ");
        int n=k.nextInt();
        int [] len=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the length of movies: ");
            len[i]=k.nextInt();
        }
        int [] rates=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the rate of movies");
            rates[i]=k.nextInt();
        }
        System.out.println(Arrays.toString(len));
        System.out.println(Arrays.toString(rates));
        System.out.println(recommand(len,rates));
    }
    public static String recommand(int l[], int[]r){
        int arr[]=new int[l.length];
        for(int i=0;i<l.length;i++){
            arr[i]=l[i]*r[i];
        }
        int max=arr[0];
        int ind=0;
        int out=0;
        HashMap<Integer,Integer> film=new HashMap<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                ind=i;
            }
            else if(arr[i]==max){
                film.put(max, film.get(r[ind]));
                max=arr[i];
                ind=i;
            }
        }
        int maxkey=ind;
        int maxValue=r[ind];
        for(Map.Entry<Integer,Integer> entry:film.entrySet()){
            if(entry.getValue()>maxValue){
                maxValue=entry.getValue();
                maxkey=entry.getKey();
            }
        }
        return "The film recommanded for Lucy is: "+maxkey;
    }
}
