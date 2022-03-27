package basics.recursion;

import java.util.Arrays;

public class quicksort {
   public static void main(String[] args) {
       int []a={10,80,30,90,40,50, 70};
       int n=a.length;
       System.out.println(Arrays.toString(a));
       quicksort(a,0,n-1);
       System.out.println(Arrays.toString(a));
   }

private static void quicksort(int[] a, int i, int j) {
    if(i>=j) return;
    int p=part(a,i,j);
    quicksort(a, i, p-1);
    quicksort(a, p+1, j);
}

private static int part(int[] a, int s, int e) {
    int piv=a[s];
    int count=0;
    for(int i=s+1;i<=e;i++)
{   if(a[i]<=piv) count++;

}
int pivotidx=s+count;
swap(a,s,pivotidx);
int x=s,y=e;
while(x<pivotidx && y>pivotidx){
    while(a[x]<piv){
        x++;
    }
    while(a[y]>piv){
        y--;
    }
    if(x<pivotidx && y>pivotidx){
        swap(a, x, y);
        x++;
        y--;
    }
}
    
    return pivotidx;
}

private static void swap(int[] a, int s, int pivotidx) {
    int temp=a[s];
    a[s]=a[pivotidx];
    a[pivotidx]=temp;
}
}

