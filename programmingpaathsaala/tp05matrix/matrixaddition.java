package programmingpaathsaala.tp05matrix;

import java.util.Scanner;

/**
 * matrixaddition
 */
public class matrixaddition {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int a[][]=new int[x1][y1];
        for(int i=0;i<x1;i++){
            for(int j=0;j<y1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        if(x1!=x2 && y1!=y2)
        System.out.println("Addition is possible in matrix of similar size");
        else{
        int b[][]=new int[x2][y2];
        for(int i=0;i<x2;i++){
            for(int j=0;j<y2;j++){
                b[i][j]=sc.nextInt();
                a[i][j]+=b[i][j];
            }
        }

        for(int i=0;i<x2;i++){
            for(int j=0;j<y2;j++){
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }}
        sc.close();
    }
}