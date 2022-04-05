/*Danya gave integers 
a , b and n to Archi. Archi wants to compare 
a^n and b^n
. Help Archi with this task.

Input Format

The first line of the input contains a single integer 
T
 denoting the number of test cases. The description of 
T test cases follows.
The first and only line of each test case contains three space-separated integers 
a, b and n.
Constraints
1≤T≤1000
|a|,|b|≤10^9
1≤n≤10^9
Output Format

For each test case, print a single line containing one integer: 
1 if a^n>b^n
, 
2 if a^n<b^n or 0 if a^n=b^n
Sample Input 1
2
3 4 5
-3 2 4

Sample Output 1
2
1

*/



package programmingpaathsaala.tp03loops;

import java.util.Scanner;

public class comparingpowers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
                //int z=-1;
            if((a>0 && b<0)||a<0 &&b>0){
                if(n%2==0){
                    a=Math.abs(a);
                    b=Math.abs(b);
                    

            }
                    
        }
        if(a>b) System.out.println("1");
                    else if(b>a) System.out.println("2");
                    else if(a==b) System.out.println("0");
    }
    sc.close();
}}
