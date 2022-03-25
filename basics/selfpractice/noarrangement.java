package basics.selfpractice;

/**
 * noarrangement
 */
public class noarrangement {
    public static void main(String[] args) {
        int a[]={1,6,8,4,9,2,3,1,7,1};
        int s=4;
        int start=0;
        // b[]=new char[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]<4){
                a[i]=1;
            }
        }
        int n=a.length;
        int read=n-1;
        int write=n-1;
        while(read>=0){
            if(a[read]==1){
               int temp=a[read];
               a[write]=a[read];
               a[read]=temp;
               read--;
            }
        }
        for (int c : a) {
            System.out.print(c+" ");
        }
        
    }
}
