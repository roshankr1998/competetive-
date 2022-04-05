package basics.recursion;
import java.util.*;
public class combinationharder {
    public static void main(String[] args) {
        int a[]={2,3,6,7};
        int target=7;
        List<List<Integer>> ans=new ArrayList<>();
        //List<String> out=new ArrayList<>();
        String l="";
        solve(a,target,0,0,ans,l);
        System.out.println(ans);
        
    }

    private static void solve(int[] a, int target, int i, int sum, List<List<Integer>> ans, String l) {
        if(sum==target){
            List<Integer> res=new ArrayList<>();
            for(int z=0;z<l.length();z++){
                
                int num=l.charAt(z)-'0';
                System.out.print(num+" ");
                res.add(num);
            }
            ans.add(res);
            return;
        }
        if(sum>target) return;

        solve(a, target, i+1, sum, ans, l);
        solve(a, target, i, sum+a[i], ans, l+a[i]);
        solve(a, target, i+1, sum+a[i], ans, l+a[i]);
    }
    
}
