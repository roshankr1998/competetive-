package basics.arraylist;

public class maxima {
    public static void main(String[] args) {
        int a[]={5,3,8,7,10};
        int lmax[]=new int [a.length];
        int rmin[]=new int [a.length];
        lmax[0]=a[0];
        rmin[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++)
        {
            lmax[i]=Math.max(lmax[i-1], a[i]);
        }
        int n=a.length;
        for(int i=n-2;i>0;i--){
            rmin[i]=Math.min(rmin[i+1], a[i]);
        }
        int x=0,j=0,k=0;
        for(int i=1;i<n-1;i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                x=a[i-1];
                j=a[i];
                k=a[i+1];
                break;
            }
        }

        System.out.println(x+""+j+""+k);

    }
    
}
