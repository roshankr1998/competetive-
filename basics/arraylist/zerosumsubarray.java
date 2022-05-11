package basics.arraylist;

import java.util.*;

public class zerosumsubarray {
    public static void main(String[] args) {
        {   int arr[]={4,2,-3,1,6};
        System.out.println(check(arr,9));
            
    }
    
}

    private static boolean check(int[] arr, int x) {
        HashSet<Integer> h=new HashSet<>();
            int sum=0;
            int n=arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==0) return true;
                sum+=arr[i];
                if(sum==0) return true;
                if(h.contains(sum-x)) return true;
                else h.add(sum);
                
        }
        return false;
    }}
