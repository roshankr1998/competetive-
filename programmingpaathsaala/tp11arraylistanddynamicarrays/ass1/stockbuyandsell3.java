package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Scanner;

public class stockbuyandsell3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int lmax[]=new int[n];
        int lmin=a[0];
        lmax[0]=0;


        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],a[i]-lmin);
            lmin=Math.min(lmin, a[i]);
        }

        int rmax[]=new int[n];
        int rmin=a[n-1];
        rmax[n-1]=0;


        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],rmin-a[i]);
            rmin=Math.max(rmin, a[i]);
        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum=Math.max(sum, lmax[i]+rmax[i]);
        }
        System.out.println(sum);
        sc.close();
    }
    
}
