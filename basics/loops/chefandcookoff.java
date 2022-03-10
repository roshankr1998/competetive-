/*PPA has obtained the results of a past shuffling test. They want to estimate the skill level of each contestant. The contestants can be classified with high probability (w.h.p.) based on the number of solved problems:

A contestant that solved exactly 0 problems is a beginner.
A contestant that solved exactly 1 problem is a junior developer.
A contestant that solved exactly 2 problems is a middle developer.
A contestant that solved exactly 3 problems is a senior developer.
A contestant that solved exactly 4 problems is a hacker.
A contestant that solved all five problems is Jeff Dean.
Please help PPA to identify the programming level of each participant.

Input Format

The first line of the input contains a single integer N denoting the number of competitors.
N lines follow. The i-th of these lines contains five space-separated integers 
Ai,1,Ai,2,Ai,3,Ai,4,Ai,5
. The j-th of these integers (
    1≤j≤5
) is 1 if the i-th contestant solved the j-th problem and 0 otherwise.
Constraints
1≤N≤5000
0≤Ai,j≤1
 for each valid i, j
Output Format

For each participant, print a single line containing one string denoting PPA classification of that contestant — one of the strings "Beginner", "Junior Developer", "Middle Developer", "Senior Developer", "Hacker", "Jeff Dean" (without quotes)
Sample Input 1

7
0 0 0 0 0
0 1 0 1 0
0 0 1 0 0
1 1 1 1 1
0 1 1 1 0
0 1 1 1 1
1 1 1 1 0

Sample Output 1

Beginner
Middle Developer
Junior Developer
Jeff Dean
Senior Developer
Hacker
Hacker*/

package basics.loops;

import java.util.Scanner;

public class chefandcookoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=5;
            int sum=0;
            while(n-->0){
                sum=sum+sc.nextInt();
            }
            switch(sum){
                case 0: {System.out.println("Beginner");
                break;}

                case 1: {System.out.println("Junior Developer");
                break;}

                case 2: {System.out.println("Middle Developer");
                break;}

                case 3: {System.out.println("Senior Developer");
                break;}

                case 4: {System.out.println("Hacker");
                break;}


                case 5: {System.out.println("Jeff Dean");
                break;}
            }
        }sc.close();
    }
}
