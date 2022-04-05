/*Chef and Horsbug is busy during the summer, working together to build some ML Models. However, they got stuck in a very complicated problem and is trying to figure out the method. Chef has got two array (Lets suppose, we denote them as A and B) of length N, containing single digit numbers only.
Chef needs to combine the i-th element of array -A and B and find the greatest among the two combinations (two digit number formed by joining the digits).

Help Chef !
Input:

- First line will contain T, number of test cases.
- Each T lines contains of a single line of input, the number N - number of digits.
- The next two lines contains N space-separated integers (Let's denote it X) ---the digits in ( 0 - 9) range
Output:

For each test case, print the newly formed N two digit numbers in a space - separated format
Constraints:

- 1≤T≤1000
- 1≤N≤105
- 0≤X≤9
Sample Input:

2
5
1 2 3 4 5
3 2 1 4 5
6
9 0 1 2 3 6
4 4 5 3 2 1
Sample Output:

31 22 31 44 55
94 40 51 32 32 61
Explanation

Example case I : 1 2 3 4 5 combined with 3 2 1 4 5
Forms the array 31 22 31 44 55 since 31>13, 22=22, 31>13, 44=44, 55=55*/


package programmingpaathsaala.tp04arrays;
import java.util.*;
public class chefandarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            //int c[]=new int[n];
            for(int i=0;i<n;i++){
                int no=0;
                if(a[i]>b[i]){
                    no=a[i]*10+b[i];

                }else{
                    no=b[i]*10+a[i];

                }
                System.out.print(no+" ");
            }
            System.out.println();
}sc.close();
}
}
