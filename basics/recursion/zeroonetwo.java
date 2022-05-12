package basics.recursion;

import java.util.Arrays;

public class zeroonetwo {
    public static void main(String[] args) {
        int a[]={0,1,2,0,1,2,0,1,2};
        sortarr(a);
        System.out.println(Arrays.toString(a));
        
    }

    private static void sortarr(int[] a) {
        int lo=0;
        int high=a.length-1;
        int mid=0;

        while(mid<=high){
          if(a[mid]==0)
          swap(lo++,mid++,a); 
          
          else if(a[mid]==1)
          mid++;

          else
          swap(mid, high--, a);
            }
        }

    private static void swap(int i, int j, int[] a) {
            int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
    }
    }

