package basics.recursion;

import java.util.*;
public class transformation {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();

       //String s="";
       long temp=a;
       List<Long> l=new ArrayList<>();
       solve(a,temp,b,l,1);
       sc.close();
    }

    private static void solve(long a, long temp, long b, List<Long> l, int i) {
        if(temp==b){
            l.add(b);
            System.out.println("YES");
            System.out.println(i);
            for(int ii=0;ii<l.size();ii++){
            System.out.print(l.get(ii)+" ");}
            l=new ArrayList<>();
            return;

        }
        if(temp>b){
           //System.out.println(l);
            return;
        }
        l.add(temp);
        solve(a, 2*temp, b,l, i+1);
        solve(a, (10*temp)+1, b, l, i+1);
        l.remove(l.size()-1);
        if(l.isEmpty()) System.out.println("NO");
    }
    
}
