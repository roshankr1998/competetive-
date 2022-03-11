package basics.selfpractice;
import java.util.*;
public class codechefcontestsaturdayleave {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long ans=n/7;
            n=n%7;
            if(n==6) ans+=1;
            System.out.println(ans);
        }sc.close();
    }
}
