package basics.recursion;

/**
 * exponentiation
 */
public class exponentiation {
public static void main(String[] args) {
    int a=4;int b=4;
    long aa=power(a,b);
    System.out.println(aa);
}
    
    private static long power(int a, int b) {
        if(b==0) return 1;
        if(b==1) return a;
        long ans=power(a,b/2);

        if(b%2==0) return ans*ans;
        else return a*ans*ans;
    }
}