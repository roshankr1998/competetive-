package basics.conditionals;

import java.util.Scanner;

public class mutatedminions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int count=0;
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                a[i]=x+k;
                if(a[i]%7==0) count++;
            }
            System.out.println(count);
        }
    }
}
