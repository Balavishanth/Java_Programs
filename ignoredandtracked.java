import java.util.*;
public class ignoredandtracked {
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the number of total number of files");
        int t=k.nextInt();
        System.out.println("Enter the number of ignored files");
        int tt[]=new int[t];
        int y=1;
        for(int i=0;i<t && y<=t;i++){
            tt[i]=y;
            y++;
        }
        int ut=k.nextInt();
        System.out.println("Enter the number of tracked files");
        int ui=k.nextInt();
        int utt[]=new int[ut];
        for(int i=0;i<ut;i++){
            System.out.println("Enter the ignored");
            utt[i]=k.nextInt();
        }
        for(int i=0;i<ut;i++){
            for(int j=i+1;j<ut;j++){
                if (utt[i]>utt[j]){
                    int temp=utt[i];
                    utt[i]=utt[j];
                    utt[j]=temp;
                }
                }
            }
        int uii[]=new int[ui];
        for(int i=0;i<ui;i++){
            uii[i]=k.nextInt();
        }
        for(int i=0;i<ui;i++){
            for(int j=i+1;j<ui;j++){
                int temp=uii[i];
                uii[i]=uii[j];
                uii[j]=temp;
            }
        }
        System.out.println(Arrays.toString(utt));
        System.out.println(Arrays.toString(uii));
        System.out.println(Arrays.toString(tt));
        System.out.println(untraig(t,tt,utt,uii));
        k.close();
        }
        public static String untraig(int t, int tt[],int ut[], int ui[]){
              int utsum=0;
              for(int i=0;i<ut.length;i++){
                  for(int j=0;j<ui.length;j++){
                      if(ut[i]==ui[j]){
                          utsum++;
                          break;
                      }
                      else{
                          continue;
                      }
                  }
              }
              Set<Integer> set1 = new HashSet<>();
              Set<Integer> set2 = new HashSet<>();
              for (int num : ut) set1.add(num);
              for (int num : ui) set2.add(num);
              List<Integer> missingElements = new ArrayList<>();
              for (int num : tt) {
                  if (!set1.contains(num) && !set2.contains(num)) {
                      missingElements.add(num);
                  }
              }
              return "The number of files that are both ignored and tracked are: "+utsum+" and the number of files that are both unignored and untracked: "+missingElements.size();
        }

    }
    //another way for this sum to find the untracked annd unignored file is by using a formula r=(m-count)+(k-count)+count;

