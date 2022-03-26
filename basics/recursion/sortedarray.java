package basics.recursion;

public class sortedarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={1,5,4,3,8,9};

        boolean aa=checksorted(a,1);
        System.out.println(aa);

        boolean bb=checksorted(b,1);
        System.out.println(bb);
    }

    private static boolean checksorted(int[] a, int i) {
        if(i==a.length) return true;
        if(a[i]<a[i-1]) return false;
        return checksorted(a, i+1);
    }
}
