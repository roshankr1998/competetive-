/*
Programming Pathshala is organizing a meet. NN people will be present at the meet. Your task is to find out the total number of handshakes if every attendant shakes hands with the others exactly one time.
Input Format
•	The first line of input contains nn
Constraints
•	11 ≤≤ nn << 106106
Output Format
•	Print the total number of handshakes
Sample Input 1
3
Sample Output 1
3
Sample Input 2
5
Sample Output 2
10
Explanation
•	Case 11 : There are 33 people, so 33 handshakes takes place. P1P1 shakes hands with P2P2 and P3P3, and P2P2 shakes hands with P3P3.
Example
Input
5
Output
10

*/
package basics;

import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    n=n-1;
    long fin=0;
    while(n>0){
fin=fin+n;
n--;
    }
    System.out.println(fin);
    }
    
}
