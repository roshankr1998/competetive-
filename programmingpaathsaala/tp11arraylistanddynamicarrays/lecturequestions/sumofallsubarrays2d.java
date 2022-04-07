package programmingpaathsaala.tp11arraylistanddynamicarrays.lecturequestions;

import java.util.Scanner;

public class sumofallsubarrays2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int a[][]=new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
           a[i][j]=sc.nextInt();
       }}
       int sum=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            sum+=a[i][j]*(i+1)*(j+1)*(n-i)*(m-j);
        }}
        System.out.println(sum);
        sc.close();

    }
    
}
