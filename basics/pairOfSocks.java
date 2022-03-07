

/*A student from Programming Pathshala is ready to leave for an interview and needs a matching pair of socks immediately. If there are nn colors of socks in the drawer, how many socks need to be removed to be certain of having a matching pair?
Input Format
•	The first line of input contains nn
Constraints
•	11 ≤≤ nn << 106106
Output Format
•	Print the total number of socks that need to be removed to be certain of having a matching pair.
Sample Input 1
1
Sample Output 1
2
Sample Input 2
2
Sample Output 2
3
Explanation
•	Case 1: Only 11 color of sock is in the drawer. Any will match.
•	Case 2: 22 colors of socks are in the drawer. The first two removed may not match. At least 33 socks need to be removed to guarantee success.
Example
Input
2
Output
3
*/
    
package basics;

import java.util.Scanner;

/**
 * pairOfSocks
 */
public class pairOfSocks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+1);
    }
    
}
