package basics.selfpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class primequeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       long t=sc.nextLong();
       while(t-->0){
        long n=sc.nextLong();
        HashMap <Integer,Integer> h=new HashMap<>();
        int i=2;
        while(i<=n){
            if(n%i==0){
                if(!h.containsKey(i)){
                    h.put(i, 1);
                    n=n/i;
                }
                else if(h.containsKey(i)){
                    h.replace(i,h.get(i)+1);
                    n=n/i;
                }
            }
            while(n%i==0){
                if(!h.containsKey(i)){
                    h.put(i, 1);
                    n=n/i;
                }
                else if(h.containsKey(i)){
                    h.replace(i,h.get(i)+1);
                    n=n/i;
                }
            }
            i++;
        }
        for(Map.Entry m:h.entrySet()){
            int a=(int)m.getKey();
            int b=(int)m.getValue();
            System.out.println(a+" "+b);
        }
        
       }
       
    }
    
}
