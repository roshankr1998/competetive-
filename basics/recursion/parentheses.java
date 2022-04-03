package basics.recursion;

import java.util.*;
public class parentheses {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> l=new ArrayList<>();
        generate("",n,n,l);
        System.out.println(l);
    }

    private static void generate(String string, int open, int close, List<String> l) {

        if(open==0 && close==0){
            l.add(string);
            return;
        }
        if(open!=0){
            generate(string+'(', open-1, close, l);
        }

        if(close>open){
            generate(string+')', open, close-1, l);
        }
    }
    
}
