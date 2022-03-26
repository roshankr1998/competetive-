package basics.recursion;

import java.util.Arrays;

public class reversestring {
    public static void main(String[] args) {
        String s="moom";
        String ss[]=s.split("");
        System.out.println(Arrays.toString(ss));
       reverse(ss,0,ss.length-1);
       //Boolean a=palin(ss,0,ss.length-1);
      // System.out.println((a)?"palin":"notpalin");
       System.out.println(Arrays.toString(ss));
    }

    

    private static void reverse(String[] ss, int i, int j) {
        if(2*i>=ss.length) return;
        String temp=ss[i];
        ss[i]=ss[j];
        ss[j]=temp;
        reverse(ss, i+1, j-1);
        
    }
    
}
