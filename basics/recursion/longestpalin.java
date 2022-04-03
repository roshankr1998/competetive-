package basics.recursion;
import java.util.*;
public class longestpalin {
    public static void main(String[] args) {
        String s="babad";

        List<String> l=new ArrayList();

        solve(s,0,l,"");
        System.out.println(l);
        int max=Integer.MIN_VALUE;
        String res="";
        for(int i=0;i<l.size();i++){
            boolean a=checkpalin(l.get(i));
            if(a){
                if(l.get(i).length()>max){
                    max=l.get(i).length();
                    res=l.get(i);
                }
            }
        }
        System.out.println(res);
    }

    private static boolean checkpalin(String string) {
        String rev="";
        for(int i=string.length()-1;i>=0;i--){
            rev=rev+string.charAt(i);
        }
        return string.equals(rev);
    }

    private static void solve(String s, int i, List<String> l, String string) {
        if(i==s.length()){
            l.add(string);
            return;
        }
        solve(s, i+1, l, string);
        solve(s, i+1, l, string+s.charAt(i));
    }


    
}
