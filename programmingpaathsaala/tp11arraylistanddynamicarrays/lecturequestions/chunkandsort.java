package programmingpaathsaala.tp11arraylistanddynamicarrays.lecturequestions;

import java.util.Scanner;


public class chunkandsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0;int j=0;int ans=0;
        while(i<n){
            for(j=i;j<n;j++){
                if(check (a,i,j)) break;
                 
            }
    ans++;
    i=j+1;
        }
        System.out.println(ans);
        sc.close();
    }
    

    private static boolean check(int[] a, int i, int j) {
        int k=0;
        int count=0;
        for( k=i;k<=j;k++){
            if(a[k]>=i && a[k]<=j)
             count++;
        }
            if(count==(j-i+1))
            return true;
            else return false;
    }
    
}
