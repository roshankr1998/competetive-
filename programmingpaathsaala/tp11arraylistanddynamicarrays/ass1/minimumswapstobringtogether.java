package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Scanner;

public class minimumswapstobringtogether {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        int legal=0;
        int max=0;
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]<=k){
                legal++;
            }
        }
        for(int i=0;i<legal;i++){
            if(a[i]<=k) count++;
        }
        max=Math.max(max, count);

        for(int i=legal;i<n;i++){
            if(a[i]<=k) count++;
            if(a[i-legal]<=k) count--;
            max=Math.max(count, max);
        }

        System.out.println(legal-max);
        sc.close();
    }
    
}
