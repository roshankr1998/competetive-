package basics.recursion;

public class sumarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int x=0;
        int sum=findsum(a,0,x);
        System.out.println(sum);
    }

    private static int findsum(int[] a, int i, int x) {
        if(i==a.length) return x;
        return findsum(a,i+1,x+a[i]);
    }
}
