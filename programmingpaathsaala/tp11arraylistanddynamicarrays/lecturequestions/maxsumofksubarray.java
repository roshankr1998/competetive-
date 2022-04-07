package programmingpaathsaala.tp11arraylistanddynamicarrays.lecturequestions;

import java.util.Scanner;

public class maxsumofksubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=0;
        int ans=0;
        for(int i=0;i<k;i++){
            res+=a[i];
        }
        ans=res;

        for(int i=k;i<n;i++){
            res+=a[i]-a[i-k];
            ans=Math.max(res, ans);
        }
        System.out.println(ans);
        sc.close();
    }
}
