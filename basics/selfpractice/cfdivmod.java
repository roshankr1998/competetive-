package basics.selfpractice;

import java.util.Scanner;

/**
 * cfdivmod
 */
public class cfdivmod {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();
            long max=Long.MIN_VALUE;
            for(long i=a;i<=b;i++){
                long x=(i/k)+i%k;
               max= Math.max(max,x);
            }
            System.out.println(max);
        }sc.close();
    }
}