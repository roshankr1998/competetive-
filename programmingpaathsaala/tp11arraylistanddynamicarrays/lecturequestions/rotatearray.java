package programmingpaathsaala.tp11arraylistanddynamicarrays.lecturequestions;

import java.util.Arrays;
import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        int res1[]=new int[n];
        //int res2[]=new int[n];
        
        
        

        //approach 1 using another array(Left rotate)
        sort2(a,res1,n,k);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(res1));


//approach 2 inplace right rotate
        System.out.println(Arrays.toString(a));
        sort1(a,n,k);
        System.out.println(Arrays.toString(a));
        sc.close();
    }

    private static void sort2(int[] a, int[] res1, int n, int k) {
        for(int i=k;i<n+k;i++){
            res1[i-k]=a[i%n];
        }
    }

    private static void sort1(int[] a, int n, int k) {
        for(int i=0;i*i<k;i++){
            int temp=a[k-i];
            a[k-i]=a[i];
            a[i]=temp;
        }

        for(int i=k;i*i<n;i++){
            int temp=a[n-1-i];
            a[n-1-i]=a[i];
            a[i]=temp;
        }

        for(int i=0;i*i<n;i++){
            int temp=a[n-1-i];
            a[n-1-i]=a[i];
            a[i]=temp;
        }
        


    }
    
}
