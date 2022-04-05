package programmingpaathsaala.tp06strings;

import java.util.Scanner;

public class rotatedstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String goal=sc.next();
    boolean a=rotatestring(s,goal);
    System.out.println(a);
    sc.close();
    }
    
    private static boolean rotatestring(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int n=s.length();
        int x=0;
        while(x++<n){
            String g="";
            for(int i=x;i<n+x;i++ ){
                g=g+s.charAt(i%n);
            }
            if(g.equals(goal))return true;
        }



        return false;
    }
    
}
