package basics.loops.selfpractice;

public class productmaximumprefsum {
    public static void main(String[] args) {
        int a[]={10,40,5,60,8,90,9};
        int n=a.length;
        int p=10,q=5,r=3;
        int lsum[]=new int [n];
        int rsum[]=new int[n];
        lsum[0]=p*a[0];
        rsum[n-1]=r*a[n-1];
        for(int i=1;i<n;i++){
            lsum[i]=Math.max(lsum[i-1],p* a[i]);
        }
        for(int i=n-2;i>=0;i--){
            rsum[i]=Math.max(rsum[i+1], r*a[i]);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
            int x=lsum[i-1]+(q*a[i])+rsum[i+1];
            ans=Math.max(ans, x);
        }
        System.out.println(ans);
        
    }
    
}
  

