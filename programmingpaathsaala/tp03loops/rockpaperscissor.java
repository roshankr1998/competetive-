package programmingpaathsaala.tp03loops;

import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long r1=sc.nextLong();
            long p1=sc.nextLong();
            long s1=sc.nextLong();
            long r2=sc.nextLong();
            long p2=sc.nextLong();
            long s2=sc.nextLong();
            int sum=0;
           // int jon=0;int friend=0;
           if(p1<r2) sum+=p1;
           else sum+=r2;

           if(s1<p2) sum+=s1;
           else sum+=p2;

           if(r1<s2) sum+=r1;
           else sum+=s2;
           //int sum=Math.min(p1,r2)+Math.min(s1, p2)+Math.min(r1, s2);
          // System.out.println(sum+" "+Math.ceil(n/2));
            if(sum>=(Math.ceil(n/2))) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}
