package basics.recursion;

import java.util.*;
public class transformation {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

       String s="";
       int temp=a;
       List<Integer> l=new ArrayList<>();
       solve(a,temp,b,l,1);

    }

    private static void solve(int a, int temp, int b, List<Integer> l, int i) {
        if(temp==b){
            System.out.println("YES");
            System.out.println(i);
            System.out.println(l);
            l=new ArrayList<>();
            return;

        }
        if(temp>b){
            //i=0;
            temp=a;
            //2s="";
            return;
        }
        l.add(temp);
        solve(a, 2*temp, b,l, i+1);
        
        solve(a, (10*temp)+1, b, l, i+1);
        l.add(temp);l.remove(l.size()-1);
    }
    
}
