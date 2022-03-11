package basics.selfpractice;

public class summaxelements {
    public static void main(String[] args) {
        int a[]={10,40,5,60,8,90,9};
        int n=a.length;
        int lsum[]=new int [n];
        int rsum[]=new int[n];
        lsum[0]=a[0];
        rsum[n-1]=a[n-1];
        for(int i=1;i<n;i++){
            lsum[i]=Math.max(lsum[i-1], a[i]);
        }
        for(int i=n-2;i>=0;i--){
            rsum[i]=Math.max(rsum[i+1], a[i]);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
            int x=lsum[i-1]+a[i]+rsum[i+1];
            ans=Math.max(ans, x);
        }
        System.out.println(ans);
        
    }
    
}
