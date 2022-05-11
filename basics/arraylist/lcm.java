package basics.arraylist;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int [n];
         for(int i=0;i<n;i++){
             a[i]=i+1;
         }
         if(n==1) System.out.println("1");
         if(n==2) System.out.println("2");
         if(n==3) System.out.println("6");
        if(n==4) System.out.println("12");
        if(n%3==0) System.out.println(n*(n-1)*(n-2));
        if(n%3==1) System.out.println(a);

    }
    
}
