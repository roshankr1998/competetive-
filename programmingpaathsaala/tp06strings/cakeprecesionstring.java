package programmingpaathsaala.tp06strings;

import java.util.Scanner;

import java.math.*;

public class cakeprecesionstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //int t=sc.nextInt();
        while(t-->0){
		//	 long  a=sc.nextLong
        BigInteger a =new BigInteger("0");
        a=sc.nextBigInteger();
        BigInteger b= new BigInteger("2");
		BigInteger c= new BigInteger("1");
        c=a.subtract(c);
        c=c.add(b);
        
        System.out.println(c.toString());

    }
    sc.close();
}
}
