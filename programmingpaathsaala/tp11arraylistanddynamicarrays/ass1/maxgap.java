package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Arrays;
import java.util.Scanner;

public class maxgap {



    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       } 
       int x=maximumGap(a);
       System.out.println(x);
       sc.close();
    }
    public static int maximumGap(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        if(n<2) return 0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        if(max==min) return 0;
        int diff=max-min;
        int x=n-1;
        int div=diff/x;
        if(diff%x!=0) div+=1;
        
        int minarr[]=new int[n];
        int maxarr[]=new int[n];
        Arrays.fill(minarr,Integer.MAX_VALUE);
        Arrays.fill(maxarr,Integer.MIN_VALUE);
        for(int i=0;i<n;i++){
            int bkt=(nums[i]-min)/div;
            minarr[bkt]=Math.min(minarr[bkt],nums[i]);
            maxarr[bkt]=Math.max(maxarr[bkt],nums[i]);
        }
        
        
        int ans=Integer.MIN_VALUE;
        int prev=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(minarr[i]==Integer.MAX_VALUE) continue;
            if(prev==Integer.MIN_VALUE) prev=maxarr[i];
            else{
                ans=Math.max(ans,minarr[i]-prev);
                prev=maxarr[i];
            }
        }
        
        return ans;
    }
}
    

