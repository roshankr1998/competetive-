package basics.arraylist;

import java.util.Scanner;

public class queries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxsum[]=new int[n];
        maxsum[0]=a[0];
        for(int i=1;i<n;i++){
            maxsum[i]=maxsum[i-1]+a[i];
        }

        int l=sc.nextInt();
        int r=sc.nextInt();
        if(l==0) System.out.println(maxsum[r]);
        else System.out.println(maxsum[r]-maxsum[l-1]);
        sc.close();
    }
    
}
