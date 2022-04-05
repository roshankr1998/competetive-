package programmingpaathsaala.tp06strings;

import java.util.Scanner;

public class printstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length()-1;
        if(s.length()>2 && s.charAt(n)=='t'&& s.charAt(n-1)=='s' && s.charAt(n-2)=='i'){
            System.out.println("ist");
        }else if(s.charAt(n)=='r'&& s.charAt(n-1)=='e'){
            System.out.println("er");
        }
        sc.close();
    }
    
}
