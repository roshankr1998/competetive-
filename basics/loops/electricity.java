package basics.loops;

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
