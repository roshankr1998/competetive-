/*
People in PPAland have three different eye colors, namely brown, blue, and green.. green is the rarest of the eye colors whereas brown is most common.
The eye color of the child of two people is most likely to be the most common eye color between them.
You are given two characters denoting the eye colors of two people in PPAland. The character RR denotes bRownbRown color, BB denotes BlueBlue color, and GG denotes Green color.
Determine the most likely eye color of their child. (Print RR, BB or GG denoting bRownbRown, BlueBlue or GreenGreen respectively).
Input Format
•	The first line of input contains two space-separated characters, the eye colors of the parents.
Constraints
•	Each character in the input is one among {RR, BB, GG}.
Output Format
•	Print a single character denoting the most likely eye color of the child. (Print R, B or G denoting brown, blue or green respectively).
Sample Input 1
R B
Sample Output 1
R
Explanation
The two people have brown and blue eyes and brown is the most common. Therefore, their child will most likely have brown eyes.
Example
Input
R B
Output
R



*/package basics.conditionals;
import java.util.*;
public class Eyecolor {
    
    public static void main (String[] args) throws java.lang.Exception
    {
		Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
		char a=s.charAt(0);
		char b=s.charAt(2);
		if(a=='R' || b=='R' )
		System.out.println("R");
		else if(a=='B' || b=='B')
					System.out.println("B");
		else if(a=='G' || b=='G')		System.out.println("G");
		
		
				//System.out.print(a+" "+b);
                sc.close();
    }
}
