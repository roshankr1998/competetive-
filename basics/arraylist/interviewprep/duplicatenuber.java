package basics.arraylist.interviewprep;

import java.util.HashSet;

public class duplicatenuber {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,5,5};
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!h.add(a[i]))
            System.out.println(a[i]);
        }
    }
    
}
