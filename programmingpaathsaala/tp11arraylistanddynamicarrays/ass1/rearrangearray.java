package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Arrays;
import java.util.Scanner;

public class rearrangearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<n;i++){
            int old=a[i]%n;
            a[old]=a[old]+(n*i);
        }
        for(int i=0;i<n;i++){
            a[i]=a[i]/n;
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
    
}
