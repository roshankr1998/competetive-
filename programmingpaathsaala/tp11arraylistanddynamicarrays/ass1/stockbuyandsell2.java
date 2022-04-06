package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Scanner;

public class stockbuyandsell2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
    for(int i=1;i<n;i++){
        if(a[i]>a[i-1])
        sum+=a[i]-a[i-1];
    }

    System.out.println(sum);
    sc.close();
    
    
    }
}
