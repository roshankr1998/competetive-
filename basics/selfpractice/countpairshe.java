package basics.selfpractice;
import java.util.*;
public class countpairshe {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            HashMap<Integer,Integer> h=new HashMap<>();
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int sum=(a[i]*a[i])+(a[j]*a[j])+(a[i]*a[j]);
                    int rem=sum%p;
                    if(!h.containsKey(rem))
                    h.put(rem,1);
                    else
                    h.replace(rem,h.get(rem)+1);
                }
            }
            System.out.println(h.get(k));
        }
        sc.close();
 
     }
 }
 

 
