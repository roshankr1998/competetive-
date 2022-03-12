package basics.selfpractice;

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
        int ans=0;
        while(t-->0){
            int left=sc.nextInt()-1;
            int right=sc.nextInt()-1;
            int sum=0;
            for(int i=left;i<=right;i++){ sum+=a[i];
        }
        if(sum>0) ans+=sum;
    }
        System.out.println(ans);
        sc.close();
    }
    
}
