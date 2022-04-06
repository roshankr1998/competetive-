package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Scanner;

public class alyonaandflowers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p[]=new int [n];
        p[0]=a[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+a[i];
        }
        int sum=0;
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int x=0;
            if(l==1) x=p[r-1];
            else x=p[r-1]-p[l-2];
            
            if(x>0) sum=sum+x;
        }

        System.out.println(sum);
    }
    
}
