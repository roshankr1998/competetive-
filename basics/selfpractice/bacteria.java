package basics.selfpractice;

import java.util.Scanner;

public class bacteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=0;
        while(a>0){
            res=res+a%2;
            a=a/2;
        }
        System.out.println(res);
        sc.close();
    }
    
}
