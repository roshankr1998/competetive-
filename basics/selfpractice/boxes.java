package basics.selfpractice;
import java.util.*;
public class boxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        HashMap<Long,Integer> h=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(!h.containsKey(a[i])) {
            h.put(a[i], 1);
        }else{
            h.replace(a[i],h.get(a[i])+1);
        }
        
       }
      for(Map.Entry map : h.entrySet()){
          int val=(int)map.getValue();
          if(val>max) max=val;
      }

      System.out.println(max);
}}
