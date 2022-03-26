package basics.recursion;

import java.util.Arrays;

public class selectionsortrecursion {
    public static void main(String[] args) {
        int a[]={1,4,5,6,2,1};
        int n=a.length;
        select(a,n,0);
        System.out.println(Arrays.toString(a));
    }

    private static void select(int[] a, int n, int index) {
        if(index==n) return;
        
        int minindex=index;
        for(int i=index+1;i<n;i++){
            if(a[i]<a[minindex]){
                //min=a[i];
                minindex=i;
            }
        }

        
                int temp=a[index];
                a[index]=a[minindex];
                a[minindex]=temp;
            

        
        select(a,n,index+1);
    }
    
}
