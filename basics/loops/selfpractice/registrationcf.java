package basics.loops.selfpractice;

import java.util.HashMap;
import java.util.Scanner;

public class registrationcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        HashMap <String,Integer> h=new HashMap<>();
        while( n-->0){
            String s=sc.next();
            if(!h.containsKey(s)){
                h.put(s,1);
                System.out.println("OK");
            }else{
                System.out.println(s+""+h.get(s));
                h.replace(s, h.get(s), h.get(s)+1);
            }


        }
        sc.close();
    }
}
