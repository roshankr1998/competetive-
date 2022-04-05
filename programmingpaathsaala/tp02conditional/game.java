/*

You wish to buy video games from the famous online video game store Mist.
Usually, all games are sold at the same price, pp dollars. However, they are planning to have the seasonal Halloween Sale next month in which you can buy games at a cheaper price.
Specifically, the first game will cost pp dollars, and every subsequent game will cost dd dollars less than the previous one. This continues until the cost becomes less than or equal to dollars, after which every game will cost mm dollars.
How many games can you buy during the Halloween Sale?
Input Format
•	The first line of input contains four space-separated characters, p,d,m,s where pp is the price of the first game, dd is the discount from the previous game price, mm is the minimum cost of a game and ss is the starting budget
Constraints
•	1 ≤ m ≤ p ≤ 100
•	1≤ d≤ 100
•	1 ≤s ≤ 10^4
Output Format
•	Print the total number of games you can buy during the Halloween Sale
Sample Input 1
20 3 6 80
Sample Output 1
6
Explanation
The following are the costs of the first 1111, in order: 20,17,14,11,8,6,6,6,6,6,6 With a budget of 8080, you can buy 66 games at a cost of 20+17+14+11+8+6=7620+17+14+11+8+6=76. A 7th7th game for an additional 66 units exceeds the budget.
Example
Input
20 3 6 80
Output
6

*/

package programmingpaathsaala.tp02conditional;

import java.util.Scanner;

public class game {
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner sc =new Scanner (System.in);
		int cost=sc.nextInt();
		int dis=sc.nextInt();
		int min=sc.nextInt();
		int budget=sc.nextInt();
		
		int count=0;
		int totcost=0;
		while((totcost+cost)<=budget){
			
			totcost=totcost+cost;
			if((cost-dis)>min) cost=cost-dis;
			else cost=min;
			
			count++;
		}
		System.out.println(count);
        sc.close();
    }
}