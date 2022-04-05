/*
Given integers b and a, find the smallest integer h, such that there exists a triangle of height h, base b, having an area of at least aa.
Input Format
•	The first line contains integers bb and aa
Constraints
•	11 ≤≤ b ≤≤ 10^6
Output Format
•	Print the minimum integer height to form a triangle with an area of at least aa
Sample Input 1
2 2
Sample Output 1
2
Sample Input 2
17 100
Sample Output 2
12
Explanation The task is to find the smallest integer height of the triangle with base 2 and area at least 2 .
 It turns out, that there are triangles with height 2 , base 2 and area 2 ,
 for example a triangle with corners in the following points: (1,1),(3,1),(1,3)(1,1),(3,1),(1,3)
It can be proved that there is no triangle with integer height smaller than 2 , base 2 and area at least 2.
Example
Input
17 100
Output
12




*/package programmingpaathsaala.tp01operators;

import java.util.Scanner;

public class minheighttriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float b=sc.nextFloat();
        int a=sc.nextInt();

        int h=(int)Math.ceil((2*a)/b);
        System.out.println(h);
        sc.close();
    }
}
