package basics.arraylist.interviewprep;

import java.util.Arrays;

/**
 * missingnumberm
 */
public class missingnumberm {

    public static void main(String[] args) {
        int a[]={1,4,3,5};
        int count=1;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]==count) count++;
        }
        System.out.println(count);

        int n=a.length;
        int ac=0;
        int sum=(n+1)*((n+2)/2);
        for(int i=0;i<n;i++){
            ac+=a[i];
        }
        System.out.println(sum-ac);
    }
}