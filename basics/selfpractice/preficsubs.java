package basics.selfpractice;

import java.util.HashMap;
import java.util.Scanner;

public class preficsubs {
    public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	     int t=sc.nextInt();
	        while(t-->0){
	           HashMap <Character,Integer> h=new HashMap<>();
               String s=sc.next();
               int left=0;;
               int max=Integer.MIN_VALUE;
               for(int i=0;i<s.length();i++){
                if(h.containsKey(s.charAt(i))){
                    max=Math.max(max,h.size());
                    while (h.containsKey(s.charAt(i))) {

                        h.remove(s.charAt(left));
                        left++; 
                    }}
                    h.put(s.charAt(i),1);
                   
                }    
               System.out.println(max); 
               sc.close();
	    }
	    
	    
	}}
		