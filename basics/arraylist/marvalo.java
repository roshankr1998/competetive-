/*
Professor Dumbledore is helping Harry destroy the Horcruxes. He went to Gaunt Shack as he suspected a Horcrux to be present there. He saw Marvolo Gaunt's Ring and identified it as a Horcrux. Although he destroyed it, he is still affected by its curse. Professor Snape is helping Dumbledore remove the curse. For this, he wants to give Dumbledore exactly x drops of the potion he made.

Value of x is calculated as maximum of p·ai + q·aj + r·ak for given p, q, r and array a1, a2, ... an such that 1 ≤ i ≤ j ≤ k ≤ n. Help Snape find the value of x. Do note that the value of x may be negative.

Input
First line of input contains 4 integers n, p, q, r ( - 109 ≤ p, q, r ≤ 109, 1 ≤ n ≤ 105).

Next line of input contains n space separated integers a1, a2, ... an ( - 109 ≤ ai ≤ 109).

Output
Output a single integer the maximum value of p·ai + q·aj + r·ak that can be obtained provided 1 ≤ i ≤ j ≤ k ≤ n.

Examples
input
5 1 2 3
1 2 3 4 5
output
30
input
5 1 2 -3
-1 -2 -3 -4 -5
output
12*/

package basics.arraylist;

import java.util.Scanner;

public class marvalo {
   public static void main(String[] args) {
       Scanner sc=new Scanner( System.in);
   int n=sc.nextInt();
   int p=sc.nextInt();
   int q=sc.nextInt();
   int r=sc.nextInt();
   int a[]=new int [n];
   for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
   }

    int lsum[]=new int [n];
    int rsum[]=new int[n];
    lsum[0]=p*a[0];
    rsum[n-1]=r*a[n-1];
    for(int i=1;i<n;i++){
        lsum[i]=Math.max(lsum[i-1],p* a[i]);
    }
    for(int i=n-2;i>=0;i--){
        rsum[i]=Math.max(rsum[i+1], r*a[i]);
    }
    int ans=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        int x=lsum[i]+(q*a[i])+rsum[i];
        ans=Math.max(ans, x);
    }
    System.out.println(ans);
    sc.close();
   } 
}
