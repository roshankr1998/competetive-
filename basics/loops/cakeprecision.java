package basics.loops;
import java.util.*;
import java.math.*;
/**
 * cakeprecision
 */
public class cakeprecision {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
        BigInteger a =new BigInteger("0");
        a=sc.nextBigInteger();
        BigInteger b= new BigInteger("2");
        a=a.divide(b);
        a=a.add(b);
        
        System.out.println(a.toString());

    }
    sc.close();
}
}