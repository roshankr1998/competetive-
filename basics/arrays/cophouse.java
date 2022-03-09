package basics.arrays;

import java.util.Scanner;

public class cophouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int x=sc.nextInt();
            int y=sc.nextInt();
            int dist=x*y;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }int count=0;
           // boolean  z[]=new boolean[101];
            for(int i=1;i<=100;i++ ){
               boolean z=true;
                for(int j=0;j<n;j++){
                    int left=Math.max((a[j]-dist),1);
                    int right=Math.min((a[j]+dist),100);

                    if(i>=left && i<=right)
                    z=false;

                }
                if(z==true) count+=1;
            }
            System.out.println(count);
        }sc.close();
    }
}
