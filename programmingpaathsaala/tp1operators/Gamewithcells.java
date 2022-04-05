/*
Arty is daydreaming in DSA class. He has a sheet of graph paper with n rows and mm columns, and he imagines that there is an army base in each cell for a total of n∗m bases. He wants to drop supplies at strategic points on the sheet, marking each drop point with a red dot. If a base contains at least one package inside or on top of its border fence, then it is considered to be supplied.
 
Given nn and mm, what is the minimum number of packages that Arty must drop to supply all of his bases?
Input Format
•	The first line contains integers nn and mm
Constraints
•	1 ≤ n,m ≤1000
Output Format
•	Print the the minimum number of packages required
Sample Input 1
2 2
Sample Output 1
1
Explanation Arty has four bases in a grid. If he drops a single package where the walls of all four bases intersect, then those four cells can access the package.   Because he managed to supply all four bases with a single supply drop, we print as our answer.
Example
Input
2 2
Output
1


*/
package programmingpaathsaala.tp1operators;

import java.util.Scanner;

public class Gamewithcells {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
    int res=0;
  //when both n and m  are even 
  if(n%2==0 && m%2==0)
  res=(n*m)/4;

  //when both n and m  are odd 
  if(n%2!=0 && m%2!=0)
  res=((n-1)*(m-1))/4 +(n+m)/2;

  //when n is even and m is odd 
  if(n%2==0 && m%2!=0)
  res=(n*(m-1))/4 + n/2;
  
  //when ,m is even and n is odd 
  if(n%2!=0 && m%2==0)
  res=(m*(n-1))/4 + m/2;


  System.out.println(res);
  sc.close();
}    
}
