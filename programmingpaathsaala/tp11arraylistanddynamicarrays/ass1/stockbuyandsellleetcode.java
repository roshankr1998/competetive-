package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Scanner;

public class stockbuyandsellleetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int rmax[]=new int[n];
        rmax[n-1]=a[n-1];

        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(a[i], rmax[i+1]);
        }

        int res=0;

        for(int i=0;i<n;i++){
            res=Math.max(res, rmax[i]-a[i]);
        }
        System.out.println(res);
        sc.close();
    
    }
}
