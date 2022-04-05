package basics.arraylist;
import java.util.*;
public class minwindow {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String s1=s.next();
    String s2=s.next();
    String a=minWindow(s1,s2);
    System.out.println(a);
    s.close(); 
   } 
   public static String minWindow(String s, String t) {
    //int sb[]=new int[26];
    int tb[]=new int[26];
    for(int i=0;i<t.length();i++){
        tb[s.charAt(i)-'a']++;  
    }
    return t;
    
}
}
