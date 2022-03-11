package basics.selfpractice;

import java.util.Scanner;

/**
 * ceilsumcc
 */
public class ceilsumcc {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double a=sc.nextInt();
            double b=sc.nextInt();
            double x;
            if(b>a) x=b-1;
            else if(a>b) x=a-1;
            else x=a;
            
           
                double sum=Math.ceil((x-a)/2)+Math.ceil((b-x)/2);
                
            System.out.println((int)sum);
        }sc.close();
    }
}