/*
There are n piles of coins, where the ith pile has ai coins. You need to collect the maximum number of coins from these piles, but you must fulfill the following condition:
Let us say you pick xi coins from the ith pile, then:
•	x1+x3+x5 = x2+x4+x6.
•	0≤xi≤ai
For example, if n=3 and, a=[2,3,2] you can pick the coins as x=[1,2,1] because x1+x3=1+1=2 and x2=2. Find the maximum total number of coins you can pick.
Input Format
•	The first line of input contains a single integer n denoting the number of piles.
•	The second line of input contains n space-separated integers ai, where the ith integer denoted the number of coins in ith pile.
Constraints
•	2≤n≤10^5
•	1≤ai≤10^3
Output Format
•	Print a single integer denoting the maximum total number of coins you can pick.
Sample Input 1
4
5 1 1 4
Sample Output 1
10
Explanation
Let x=[4,1,1,4] hence x1+x3=x2+x4 and total number of coins picked is 10 It can be checked that it is not possible to pick any greater number of coins.

*/
package programmingpaathsaala.tp03loops;

import java.util.Scanner;

public class coingame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int a[]=new int[n];
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(i%2==0)
            odd+=sc.nextInt();
            else 
            even+=sc.nextInt();
        }
        System.out.println(2*Math.min(even, odd));
        sc.close();
    }
    
}
