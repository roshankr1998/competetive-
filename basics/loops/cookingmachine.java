package basics.loops;

import java.util.Scanner;

public class cookingmachine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;
            while(b%a!=0){
                count++;
                a=a/2;
            }
            while(a!=b){
                count++;
                a=a*2;
            }
            System.out.println(count);
            sc.close();
        }
    }
}
