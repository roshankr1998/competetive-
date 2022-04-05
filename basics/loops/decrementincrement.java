/*Write a program to obtain a number Nand increment its value by 1 if the number is divisible by 4
 otherwise decrement its value by 1
.

Input Format

First line will contain a number 
N
Constraints
0≤N≤1000
Output Format

Output a single line, the new value of the number.
Sample Input 1
5

Sample Output 1
4

Explanation
Since 5 is not divisible by 4 hence, its value is decreased by 
1*/


package basics.loops;
import java.util.*;
public class decrementincrement {
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		if(n%4==0) System.out.println(n+1);
		else System.out.println(n-1);
    in.close();
    }
}