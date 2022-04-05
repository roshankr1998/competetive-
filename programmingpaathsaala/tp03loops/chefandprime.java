/* 

You are given NN elements A1,A2…An and you have to create a new number by adding number of digits of each element. If the number is prime then print “Yes” otherwise print “No”.
Input Format
•	First-line will contain TT, number of test cases. Then the test cases follow
•	Each test case contains two lines of input
•	First-line contains number of element, N
•	Second-line contains NN elements A1,A2...An
Constraints
•	1≤T≤50
•	2≤N≤10^3
•	0≤A[i]≤10^18
Output Format
•	For each test case, output in a single line if the generated number is prime then print "Yes" otherwise "No".
Sample Input 1
1
3
9 12 111
Sample Output 1
No
Explanation
•	In the Given Test case : 9−>1,12−>2,111−>39−>1,12−>2,111−>3. So the generated number will be 6(1+2+3)6(1+2+3)
•	Since 66 is not prime so the answer will be No
Example
Input
1  
3  
9 12 111
Output
No


 
*/package programmingpaathsaala.tp03loops;
import java.util.*;


public class chefandprime {
    
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			long sum=0;
			for(int i=0;i<n;i++){
				long x=sc.nextLong();
				
				sum=sum+sod(x);
			}
			if(isprime(sum)) System.out.println("Yes");
			else  System.out.println("No");
			
			}
			sc.close();
			
		}
	public static long sod(long x){
		long count=0;
		if(x==0) return 1;
		while(x>0){
			x=x/10;
			count++;
		}
		return count;
	}
	public static boolean isprime(long x){
		if(x<=1) return false;
		if(x==2|| x==3) return true;
		if(x%2==0|| x%3==0) return false;
		for(int i=5;i*i<=x;i=i+6){
			if(x%i==0 || x%(i+2)==0) return false;
		}
		return true;
	}
}
