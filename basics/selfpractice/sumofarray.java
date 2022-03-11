package basics.selfpractice;

import java.util.Scanner;

public class sumofarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        int a[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int fi=0;int j=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            while(sum>target){
                sum-=a[fi];
                fi++;
            }
            if(sum==target) break;
            j++;
        }
        System.out.println((fi+1)+" "+(j+1));
    }
    sc.close();
}
}
