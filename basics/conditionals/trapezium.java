/*
Ram came across a special trapezium in which non - parallel sides are equal in length and named it as isosceles trapezium. He thought of making a circular closed loop by joining the edges of this isosceles trapezium. You are given a base angle x of the isosceles trapezium click here. Your task is to calculate the total number of isosceles trapeziums required to form a closed loop.
Input Format
•	First line will contain TT, number of testcases. Then the testcases follow.
•	Each testcase contains of a single line of input, one integer xx.
Constraints
•	1≤T≤100
•	1≤x≤89
Output Format
•	For each testcase, output in a single line the total number of isosceles trapeziums required to form a closed circular loop. It is guaranteed that the answer will be always a natural number.
Sample Input 1
1
80
Sample Output 1
18
Explanation
1818 isosceles trapeziums are required to form a closed circular loop
Example
Input
1
80
Output
18



*/

package basics.conditionals;
import java.util.*;
public class trapezium {
    public static void main (String[] args) throws java.lang.Exception
    {
           Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			double angle=90-n;
			angle=(180/angle);
			System.out.println((int)angle);
		}}
}
    

