/*Given two points, p=(px,py) and q=(qx,qy).
 We consider reflection or image r=(rx,ry), of point p across point q to be a 180o rotation of point p around q.
Given points p and q, find point r and print two space-separated integers denoting the respective values 
of rx and ry on a new line.
Input Format
•	The first line of input contains 4 integers px, py, qx, qy
Constraints
•	−100≤ px, py, qx, qy ≤ 100
Output Format
•	Print the reflection or image point
Sample Input 1
0 0 1 1
Sample Output 1
2 2
Explanation For case 1, p=(0,0) and q=(1,1) Therefore, r=(2,2)
Input
0 0 1 1
Output
2 2

*/




package programmingpaathsaala.tp01operators;

import java.util.Scanner;

public class FindPoint {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int px=sc.nextInt();
        int py=sc.nextInt();
        int qx=sc.nextInt();
        int qy=sc.nextInt();

        int zx=(2*qx)-px;
        int zy=(2*qy)-py;

        System.out.println(zx+" "+zy);
        sc.close();
    }
}
