/*You are baking a cake. While baking, in each minute the size of cake doubles as compared to its previous size.
Baking of cake is directly proportional to its size.

You are given 
a, the total time taken(in minutes) to bake the whole cake.Let cake be half baked at 
kth minute.

Your task is to find the value of 
k+2

Input Format

The first line of the input contains a single integer 
T denoting the number of test cases. The description of 
T test cases follows.
The first and only line of each test case contains a single integer a
Constraints

1≤T≤8
2≤a≤10^128
Output Format

For each testcase , print one line, the value of k+2
Sample Input 1

1
2

Sample Output 1

3

Explanation

Time was 1min when cake was half baked so answer is 1+2=3*/


package basics.loops;
import java.util.*;
import java.math.*;
/**
 * cakeprecision
 */
public class cakeprecision {

    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
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