/*
Alice and Bob each created one problem for Programming Pathshala. A reviewer rates the two challenges, awarding points on a scale from 11 to 100100 for three categories: problemproblem clarity, originality, and difficulty
The rating for Alice challenge is the triplet a=(a[0],a[1],a[2]) and the rating for Bob challenge is the triplet b=(b[0],b[1],b[2])
The task is to find their comparison point by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
•	If a[i]>b[i] then Alice is awarded 11 point.
•	If a[i]<b[i] then Bob is awarded 11 point.
•	If a[i]=b[i] then neither person receives a point.
Comparison points is the total points a person earned.
Given aa and bb, determine their respective comparison points.
Input Format
•	The first line contains three integers a[0], a[1] and a[2]
•	The second line contains three integers b[0], b[1] and b[2]
Constraints
•	1≤a[i], b[i] ≤100
Output Format
•	Print Alice score is in the first position, and Bob score is in the second.
Sample Input 1
5 6 7
3 6 10
Sample Output 1 1 1
Explanation
a[0]>b[0], so Alice receives 1 point a[1]=b[1], so nobody receives a point a[2]<b[2], so Bob receives 1 point
Hence, answer is [Alice,Bob]= [1,1]
Example
Input
5 6 7
3 6 10
Output
1 1



*/
package basics.conditionals;

import java.util.*;

public class triplets
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
		int alice=0;
		int bob=0;
		int a[]=new int[3];
		for(int i=0;i<3;i++){
			a[i]=sc.nextInt();
		}
		int b[]=new int[3];
		for(int i=0;i<3;i++){
			b[i]=sc.nextInt();
		}
			for(int i=0;i<3;i++){
			if(a[i]>b[i]) alice+=1;
			else if(a[i]<b[i]) bob+=1;
		}
		System.out.println(alice+" "+bob);
        sc.close();
    }
}