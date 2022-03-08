/*

The positive odd numbers are sorted in ascending order as 1,3,5,7,9,11,13,15,..... , and grouped as (1), (3,5), (7,9,11) and so on.
Thus, the first group is (1)(1), the second group is (3,5)(3,5), the third group is (7,9,11) etc. In general, the kth group contains the next kk elements of the sequence.
Given k, find the sum of the elements of the kth group. For example, for k=3k=3, the answer is 27:
 
Input Format
•	The first line contains a single integer kk
Constraints
•	1 ≤k ≤10^6
Output Format
•	Print the sum of the elements of the kth group.
Sample Input 1
3
Sample Output 1
27
Explanation
We have k=3. The 3rd3rd group is (7,9,11) and the sum of its elements is 7+9+11=277+9+11=27.
Example
Input
3
Output
27

*/

package basics.conditionals;
import java.util.*;
import java.math.*;
public class groupsum {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		/*long sum=0;
		long fd=0;
		int i=1;
		while(i<=n){
			sum=sum+i;
			i++;
		}
		fd=(sum*2)+1;
		sum=(n)*((2*fd)+(n-1)*2)/2; */
		BigInteger b=new BigInteger(n);
		BigInteger ab=new BigInteger(n);
		ab= ab.multiply(b);
		ab= ab.multiply(b);
		System.out.print(ab.toString());
        sc.close();
    }
}