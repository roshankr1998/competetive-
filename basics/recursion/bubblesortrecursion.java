package basics.recursion;

import java.util.Arrays;

public class bubblesortrecursion {
    public static void main(String[] args) {
        int a[]={3,4,8,1,6,2};
        int n=a.length;
        System.out.println(Arrays.toString(a));
        sort(a,n);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a, int n) {
        if(n==0 || n==1) return;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
            
        }
        sort(a, n-1);
        //return a;
    }

   
    
}
