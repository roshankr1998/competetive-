package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;
import java.util.*;
public class marvalogauntring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
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
        for(int i=0;i<n;i++){
            res=Math.max(res,lmax[i]+q*a[i]+rmax[i]);
        }
        System.out.println(res);
        sc.close();
    }
    
}
