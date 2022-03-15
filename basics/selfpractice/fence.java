package basics.selfpractice;

import java.util.HashMap;
import java.util.Scanner;

public class fence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        HashMap <Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int index=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<k;i++ ){
            sum=sum+a[i];
        }
        
        min=Math.min(min, sum);
        for(int i=k;i<n;i++){
            sum=sum+a[i]-a[i-k];
            if(sum<min){
                //System.out.println(i);
                min=sum;
                index=i-1;
            }

        }
       // System.out.println(h.toString());
        //System.out.println(h.get(min));
        System.out.println(index);
    }
}
