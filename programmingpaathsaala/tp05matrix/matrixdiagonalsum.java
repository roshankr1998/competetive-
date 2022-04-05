package programmingpaathsaala.tp05matrix;

import java.util.Scanner;

public class matrixdiagonalsum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j && (i+j)!=(i+m-1-j)){
                    sum=sum+a[i][j]+a[i][m-1-j];
                }else if(i==j && (i+j)==(i+m-1-j)){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
    
}
