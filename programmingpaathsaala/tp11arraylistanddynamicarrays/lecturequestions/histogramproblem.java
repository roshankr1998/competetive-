package programmingpaathsaala.tp11arraylistanddynamicarrays.lecturequestions;

import java.util.Scanner;

public class histogramproblem {
    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int lmax[]=new int[n];
    int rmax[]=new int [n];
    lmax[0]=a[0];
    rmax[n-1]=a[n-1];

    for(int i=1;i<n;i++){
        lmax[i]=Math.max(lmax[i-1],a[i]);
    }
    for(int i=n-2;i>=0;i--){
        rmax[i]=Math.max(rmax[i+1],a[i]);
    }

    int ans=0;
    for(int i=0;i<n;i++){
        ans=ans+(Math.min(lmax[i],rmax[i])-a[i]);
    }
    System.out.println(ans);
    sc.close();
}
    
}
