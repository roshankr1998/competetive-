/*
Ram wants to become heavier than his brother Shyam.
Right now, Ram and Shyam weigh a and b respectively. It is guaranteed that Ram weighs less than or equal to his brother.
Ram eats a lot and his weight is tripled after every year, while Shyam does not each much so his weight is doubled after every year.
After how many full years will Ram become strictly heavier than Shyam?
Input Format
•	The first line contains two integers a and b
Constraints
•	1≤ a ≤ b ≤10
Output Format
•	Print the number of years after which Ram will become strictly heavier than Shyam
Sample Input 1
4 7
Sample Output 1
2
Explanation
Ram weighs 4 and Shyam weighs 7 initially. After one year their weights are 4·3 = 12 and 7·2 = 14 respectively (one weight is tripled while the other one is doubled). Ram is not heavier than Shyam yet. After the second year, weights are 36 and 28, so the first weight is greater than the second one. Ram became heavier than Shyam after two years so you should print 2.
Example
Input
4 7
Output
2



*/package programmingpaathsaala.tp03loops;
import java.util.*;
public class countyears {
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner sc= new Scanner(System.in);
		int ram=sc.nextInt();
		int shyam=sc.nextInt();
		int count=0;
		while(ram<=shyam){
			ram=ram*3;
			shyam=shyam*2;
			count++;
		}
		System.out.println(count);
        sc.close();
    }
}