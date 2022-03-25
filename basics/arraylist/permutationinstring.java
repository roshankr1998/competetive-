package basics.arraylist;

import java.util.Scanner;

public class permutationinstring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        boolean a=stringpermute(s1,s2);
        System.out.println(a);
        s.close();
        

    
    }

    private static boolean stringpermute(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int s1p[]=new int[26];
        int s2p[]=new int[26];
        for(int i=0;i<s1.length();i++){
            s1p[s1.charAt(i)-'a']++;
            s2p[s2.charAt(i)-'a']++;
        }
        boolean a=compareper(s1p,s2p);
        if(a) return true;
        for(int i=s1.length();i<s2.length();i++){
            s2p[s2.charAt(i)-'a']++;
            s2p[s2.charAt(i-s1.length())-'a']--;
            if(compareper(s1p, s2p)) return true;
        }
        
        return false;
    }

    private static boolean compareper(int[] s1p, int[] s2p) {
        for(int i=0;i<26;i++){
            if(s1p[i]!=s2p[i]) return false;
        }
        return true;
    }
    
}
