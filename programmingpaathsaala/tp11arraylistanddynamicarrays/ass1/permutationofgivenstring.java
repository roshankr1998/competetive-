package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

public class permutationofgivenstring {
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidboaooo";
        System.out.println(checkpermutation(s1,s2));
        
    }

    private static boolean checkpermutation(String s1, String s2) {

        if(s1.length()>s2.length()) return false;
            int s1p[]=new int[26];
            int s2p[]=new int[26];

            for(int i=0;i<s1.length();i++){
                s1p[s1.charAt(i)-'a']++;
                s2p[s2.charAt(i)-'a']++;
            }

           if( compare(s1p,s2p)) return true;
           for(int i=s1.length();i<s2.length();i++){
               s2p[s2.charAt(i)-'a']++;
               s2p[s2.charAt(i-s1.length())-'a']--;

               if( compare(s1p,s2p)) return true;

           }
        return false;
    }

    private static boolean compare(int[] s1p, int[] s2p) {
        for(int i=0;i<26;i++){
            if(s1p[i]!=s2p[i]) return false;
        }
        return true;
    }
    
}
