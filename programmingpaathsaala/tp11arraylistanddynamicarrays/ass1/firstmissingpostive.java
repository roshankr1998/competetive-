package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Arrays;
import java.util.Scanner;

public class firstmissingpostive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=find(a);
        System.out.println(x);
    }

    private static int find(int[] a) {
        Arrays.sort(a);
        int n=1;
        for(int i=0;i<a.length;i++){
            if(a[i]==n)
            n++;
        }
        return n;
    }
    
}
