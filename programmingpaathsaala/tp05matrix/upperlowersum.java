package programmingpaathsaala.tp05matrix;

import java.util.Scanner;

public class upperlowersum {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int a[][]=new int [x][y];
    int upper=0;
    int lower=0;
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            a[i][j]=sc.nextInt();
            if(j<=i){
                lower+=a[i][j];
            }
            if(j>=i){
                upper+=a[i][j];
            }
        }
        
    }
    System.out.println(upper);
        System.out.println(lower);
        sc.close();
}    
}
