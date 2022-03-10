/*An integer is said to be a palindrome if it is equal to its reverse. For example, 
79197
 and 
324423
 are palindromes. In this task you will be given an integer 
N, 1≤N≤1000000
. You must find the smallest integer 
M≥N
 such that M is a prime number and M is a palindrome.

Input Format

A single integer N
Constraints
1≤N≤1000000
Output Format

Your output must consist of a single integer, the smallest prime palindrome greater than or equal to 
N
.
Sample Input 1
31

Sample Output 1
101

Explanation
101
 is the smallest prime palindrome number which is greater than equal to 
31*/


package basics.loops;

import java.util.Scanner;

public class palindromeinteger {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   // int i=n+1;
    while(n>=0){
        boolean a=isPrime(n);
        if(a==true){
            boolean z=palin(n);
            if(z==true){
                System.out.println(n);
                break;
            }
        }
        n++;
    }
    sc.close();
    
}
private static boolean isPrime(int i) {
    int count=0;
        int c=1;
        while(c<=i){
            if(i%c==0) count++;
            c++;
        }
        if(count==2) return true;
        return false;
    }
public static boolean palin(int x){
    int rev=0;
    int n=x;
    while(x>0){
        rev=rev*10+x%10;
        x=x/10;
    }
    if(n==rev) return true;
    return false;
}
}
