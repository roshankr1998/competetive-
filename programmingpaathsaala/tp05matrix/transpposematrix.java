package programmingpaathsaala.tp05matrix;

import java.util.Scanner;

public class transpposematrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int [n][m];
        int res[][]=new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();

            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[j][i]=a[i][j];
                

            }

        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");

            }System.out.println();

        }
        sc.close();
    }
    
}
