package basics.recursion;

public class binarysearchrecursion {
    public static void main(String[] args) {
        int a[]={1,2,4,6,9,11,15};
        int key=1;

        find(a,0,a.length-1,key);
    }

    private static void find(int[] a, int i, int j, int key) {
        if(i>j){ System.out.println("not found");
        return;
    }
    int mid=i+(j-i)/2;
    if(a[mid]==key) System.out.println("found");
    if(a[mid]>key) find(a,i,mid-1,key);
    if(a[mid]<key) find(a,mid+1,j,key);
    }
    
}
