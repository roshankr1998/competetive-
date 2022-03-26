package basics.recursion;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int a[]={5,4,6,2,1,3};
        int n=a.length;
        System.out.println(Arrays.toString(a));
        margesort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }

    private static void margesort(int[] a, int s, int e) {
        if(s>=e) return;

        int mid=(s+e)/2;

        margesort(a, s, mid);

        margesort(a, mid+1, e);


        mergearr(a,s,e);
    }

    private static void mergearr(int[] a, int s, int e) {

        int mid=(s+e)/2;
        int l1=mid-s+1;
        int l2=e-mid;
        int idx=s;

        int a1[]=new int[l1];
        for(int i=0;i<l1;i++){
            a1[i]=a[idx++];
        }
        idx=mid+1;
        int a2[]=new int[l2];
        for(int i=0;i<l2;i++){
            a2[i]=a[idx++];
        }



        // merge 2 sorted arrays

        int i=0;
        int j=0;
        idx=s;
        while(i<l1 && j<l2){
            if(a1[i]<a2[j]){
                a[idx++]=a1[i++];
            }else{
                a[idx++]=a2[j++];
            }
        }
        while(i<l1){
            a[idx++]=a1[i++];
        }

        while(j<l2){
            a[idx++]=a2[j++];
        }

    }
}
