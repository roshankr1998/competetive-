package basics.loops.selfpractice;

import java.util.Scanner;

public class expressioncf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();

        long x=Math.max(Math.max(a+b*c, a*(b+c)),Math.max(a*b*c, (a+b)*c));
        x=Math.max(x,Math.max(a*b+c, a+b+c));
        System.out.println(x);
        sc.close();
    }
    
}
