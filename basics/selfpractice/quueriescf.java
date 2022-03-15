package basics.selfpractice;

import java.util.Scanner;

public class quueriescf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long m=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            arr[i]=a%m;        
        }
        int t=sc.nextInt();
        while (t-->0) {
            long sum=0;
            char c = sc.next().charAt(0);
            //System.out.println(c);
            if(c=='s'){
                int l=sc.nextInt();
                int r=sc.nextInt();
                long mod=sc.nextLong();
               // long sum=0;
                for(int i=l-1;i<r;i++){
                    sum+=arr[i]%mod;
                }
                System.out.println(sum);
            }else if(c=='+'){
                int idx=sc.nextInt();
                int add=sc.nextInt();
                sum=arr[idx-1]+add;
                arr[idx-1]=sum;
                System.out.println(sum);
            }else if(c=='-'){
                int idx=sc.nextInt();
                int sub=sc.nextInt();
                sum=arr[idx-1]-sub;
                if(sum<0) sum=arr[idx-1];
                arr[idx-1]=sum;
                System.out.println(sum);
                sc.close();
            }
            
        }
    }
    
}
