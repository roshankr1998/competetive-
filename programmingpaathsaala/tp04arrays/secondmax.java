package programmingpaathsaala.tp04arrays;

import java.util.Scanner;

public class secondmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        if(a[i]>max){
            secondmax=max;
            max=a[i];
        }
        }
        if(a[n-1]>secondmax && a[n-1]<max) secondmax=a[n-1];
        System.out.println(secondmax);
        sc.close();
    }
    
}
