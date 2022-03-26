package basics.recursion;

import java.util.Arrays;

public class insertionrecursion {
    public static void main(String[] args) {
        int a[]={6,5,2,1,0,4,8,9};
        int n=a.length;

        System.out.println(Arrays.toString(a));
        insert(a,1,n);
        System.out.println(Arrays.toString(a));
    }

    private static void insert(int[] a, int i, int n) {
        if(i==n) return;
        int j=i;
        while(j>0 && a[j]<a[j-1]){
            int temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            j--;
        }
        insert(a, i+1, n);
    }
    
}
