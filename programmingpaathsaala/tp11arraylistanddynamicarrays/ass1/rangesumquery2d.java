package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

///mport java.util.Arrays;
import java.util.Scanner;

public class rangesumquery2d {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int a[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                a[i][j]=a[i][j]+a[i][j-1];
            }}

            for(int i=1;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=a[i][j]+a[i-1][j];
                }}

        System.out.println("enter top left coordinates");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.println("Enter bottom right coordinates");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
                

        int sum=a[x2][y2]-a[x1-1][y2]-a[x2][y1-1]+a[x1-1][y1-1];

        System.out.println(sum);
        sc.close();


        
    }
}
