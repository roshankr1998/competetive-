package programmingpaathsaala.tp11arraylistanddynamicarrays.lecturequestions;

import java.util.Scanner;

public class prefixqueries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int presum[]=new int [n];
        presum[0]=a[0];
        for(int i=1;i<n;i++){
            presum[i]=presum[i-1]+a[i];
        }

        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();

            if((l-1)==0) System.out.println(presum[r-1]);
            else{
                int sum=presum[r-1]-presum[l-1-1];
                System.out.println(sum);
                sc.close();
            }
        }
    }
    
}
