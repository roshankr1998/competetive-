package basics.loops.selfpractice;

import java.util.Scanner;

public class codechefcontestwordle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String k=sc.next();
            String fin="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==k.charAt(i))
                fin=fin+'G';
                else fin=fin+'B';

            }
            System.out.println(fin);
        }
        sc.close();
    }
    
}
