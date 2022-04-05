/*Chef School of Witchcraft and Wizardry is known for moulding young minds into the finest wizards and witches. However that comes with a lot of practice. One of the young wizards cast a spell on a spider that makes it leap greater distances.

On observing closely the spider leaped 1 meter in its first leap. 10 meters in its second leap, 19 meters in its third leap , 28 meters in its fourth leap, 37 meters in its fifth leap and so on following a pattern.

In order to capture the spider, the young wizard must be able to tell the number of leaps the spider would take to reach a given distance.
 

Input
The first line of input contains one integer T denoting the number of test cases The second line contains an integer N denoting a distance(in meter) the spider has to cover. .

Output
For each N you have to display the minimum number of leaps required to a cover a distance >=N .

Constraints
1< T < 50

10 < N < 10^9

Example
Input:
2
64
20

Output:
Case #1: 5
Case #2: 3 */


package programmingpaathsaala.tp03loops;

import java.util.Scanner;

public class chefandspider {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int a=1;
    while(t-->0){
        int n=sc.nextInt();
        int x=1;
        int leap=9;
        int count=1;
        while(x<=n){
            x=x+leap;
            leap=leap+9;
            count++;
        }
        System.out.println("Case #"+a+": "+count); 
        a=a+1; 
    }
sc.close();
    }
    
    
}

