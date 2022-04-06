package programmingpaathsaala.tp11arraylistanddynamicarrays.lecturequestions;

import java.util.Scanner;

public class maximizeexpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();

        int lmax[]=new int[n];
        lmax[0]=p*a[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],p*a[i]);
        }

        int rmax[]=new int [n];
        rmax[n-1]=r*a[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(rmax[i+1],r*a[i]);
        }
        int res=Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
            res=Math.max(res,lmax[i-1]+q*a[i]+rmax[i+1]);
        }
        System.out.println(res);
        sc.close();
    }
    
}
