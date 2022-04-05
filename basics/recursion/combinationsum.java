package basics.recursion;
import java.util.*;
public class combinationsum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int n=9;
        List<String> out=new ArrayList<>();
        String l="";
        int k=3;
        List<List<Integer>> ans=new ArrayList<>();
        solve(l,ans,0,n,0,a,out,k);
        System.out.println(ans);
    }

    private static void solve(String l, List<List<Integer>> ans, int i, int n, int sum, int[] a, List<String> out, int k) {
        if(i==9){
            if(sum==n && l.length()==k){
                out.add(l);
                List<Integer> res=new ArrayList<>();
                for(int z=0;z<l.length();z++){
                    
                    int num=l.charAt(z)-'0';
                    System.out.print(num+" ");
                    res.add(num);
                }
                ans.add(res);
               // out=new ArrayList<>();
            }
            return;
            
        }

        solve(l+a[i], ans, i+1, n, sum+a[i], a, out,k);
        solve(l, ans, i+1, n, sum, a, out,k);
    }
    
}
