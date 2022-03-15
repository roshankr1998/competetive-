package basics.selfpractice;


import java.util.Arrays;

import java.util.Scanner;

public class minimumweights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){ 
           int n=sc.nextInt();
           int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int weightc=0;
        int pw=0;
        if(k>n/2) k=n-k;
        for(int i=0;i<k;i++){
            weightc+=a[i];
        }
        for(int i=k;i<n;i++){
            pw+=a[i];
        }
        System.out.println(pw-weightc);
        sc.close();
    }}
}
