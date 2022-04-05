/*Chef likes all arrays equally. But he likes some arrays more equally than others. In particular, he loves Rainbow Arrays.

An array is Rainbow if it has the following structure:

First a1 elements equal 1.
Next a2 elements equal 2.
Next a3 elements equal 3.
Next a4 elements equal 4.
Next a5 elements equal 5.
Next a6 elements equal 6.
Next a7 elements equal 7.
Next a6 elements equal 6.
Next a5 elements equal 5.
Next a4 elements equal 4.
Next a3 elements equal 3.
Next a2 elements equal 2.
Next a1 elements equal 1.
ai can be any non-zero positive integer.
There are no other elements in array.

Help Chef in finding out if the given array is a Rainbow Array or not.

Input
The first line of the input contains an integer T denoting the number of test cases.
The first line of each test case contains an integer N, denoting the number of elements in the given array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of array.
Output
For each test case, output a line containing "yes" or "no" (without quotes) corresponding to the case if the array is rainbow array or not.
Constraints
1 ≤ T ≤ 100
7 ≤ N ≤ 100
1 ≤ Ai ≤ 10
Subtasks
Subtask 1 (100 points) : Original constraints
Example
Input
3
19
1 2 3 4 4 5 6 6 6 7 6 6 6 5 4 4 3 2 1
14
1 2 3 4 5 6 7 6 5 4 3 2 1 1
13
1 2 3 4 5 6 8 6 5 4 3 2 1

Output
yes
no
no
Explanation
The first example satisfies all the conditions.

The second example has 1 element of value 1 at the beginning and 2 elements of value 1 at the end.

The third one has no elements with value 7 after elements with value 6.*/



package programmingpaathsaala.tp04arrays;

import java.util.Scanner;

public class chefraimbow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int a[]=new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int i=0;
            int flag=0;
            while(i<(n-1-i)){

                if(a[i]!=a[n-i-1] ){ flag=1;
                    break;
            }
            if(a[0]!=1){
                flag=1;
                break;
            }
            if(a[n/2]!=7){
                flag=1;
                break;
            }
            if(a[i]+1!=a[i+1] && a[i+1]!=a[i]){
                flag=1;
                break;
            }
            i++;
        }
        if(flag==1) System.out.println("no");
        else System.out.println("yes");
            }
            sc.close();
        }
    }
    

