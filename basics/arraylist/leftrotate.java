package basics.arraylist;

import java.util.Arrays;

public class leftrotate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};

        int i=2;
        int j=5;
        System.out.println(Arrays.toString(a));
        leftrrr(a,i,j);
        System.out.println(Arrays.toString(a));
    }

    private static void leftrrr(int[] a, int i, int j) {
        int temp=a[i];
        for(int x=i+1;x<=j;x++){
            a[x-1]=a[x];
        }
        a[j]=temp;
    }
    
}
