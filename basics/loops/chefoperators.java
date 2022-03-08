/*
Ram has just started Programming, he is in first year of Engineering. Ram is reading about Relational Operators.
Relational Operators are operators which check relationship between two values. Given two numerical values 
A and B you need to help Ram in finding the relationship between them that is,

First one is greater than second or,
First one is less than second or,
First and second one are equal.
Input Format

First line contains an integer 
T
, which denotes the number of testcases.
Each of the 
T
 lines contain two integers 
A
 and 
B
.
Constraints

1≤T≤10000
1≤A,B≤1000000001
Output Format

For each line of input produce one line of output. This line contains any one of the relational operators "<" , ">" , "="
Sample Input 1
3
10 20
20 10
10 10

Sample Output 1
<

>

=

Explanation
10
 is less than 
20
, so answer is <

Example
Input
3
10 20
20 10
10 10
Output
<
>
=
*/
package basics.loops;
import java.util.*;
public class chefoperators {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n-->0){
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b) System.out.println(">");
			else if(a<b) System.out.println("<");
				else System.out.println("=");
    }
sc.close();}
}