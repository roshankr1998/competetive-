package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Scanner;

public class searchmatrixefficient {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{0,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        int m=a.length;
        int n=a[0].length;
        int i=0;
        int j=n-1;
        while(i<m && j>=0){
            if(target<a[i][j]) j--;
            else if(target>a[i][j]) i++;
            else if(target==a[i][j]){
            System.out.println("target fount at "+i+ " "+j);
                break;}
        }
        sc.close();
    }
}
