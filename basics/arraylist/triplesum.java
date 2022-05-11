package basics.arraylist;

import java.util.HashSet;

public class triplesum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int res=12;
        int n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int curr=res-a[i];
            HashSet<Integer> h=new HashSet<>();
            for(int j=i+1;j<n;j++){
                if(h.contains(curr-a[j]));
                System.out.println(a[i]+" "+a[j]+" "+(curr-a[j]));
            }
        }
        //System.out.println(sum);
    }
    
}
