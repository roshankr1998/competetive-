/*
Chef wants to calculate his Electricity bill,Help him to do so

Acc to Conditions:-

For First 50 units Rs 0.50/unit

For next 100 units Rs 0.75/unit

For next 100 units Rs 1.20/unit

For unit above 250 Rs 1.50/unit

An additional surcharge of 20% is added to the bill

Input
Integer n(number of units he consumed).

 

Output
Bill Amount.

 

Constraints
1<=N<=10000

 

Example
Input:
 150
Output:
120.00*/


package programmingpaathsaala.tp03loops;

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double res=0;
        if(n<=50){
            res=n*0.50;
    }else if(n>50 && n<=150){
        res=(50*0.5)+(n-50)*0.75;
    }else if(n>150 && n<=250){
        res=(50*0.5)+(100*0.75)+(n-150)*1.2;
    }else{
        res=(50*0.5)+(100*0.75)+(100*1.2)+(n-250)*1.5;
    }
    res=(res/5)+res;
    System.out.printf("%.2f",res);
    sc.close();
}
}
