package basics.selfpractice.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class foodbelt {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s[]=new String[n*m];
        for(int i=0;i<n*m;i++){
            s[i]=sc.next();
        }
        int k=sc.nextInt();
        String search=sc.next();
        int a[]=new int[2];
        String fin[]=new String[n*m];
        for(int i=0;i<n*m;i++){
            fin[i]=s[((n*m)-k+i)%(n*m)];

        }int v=0;
        String ss[][]=new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ss[i][j]=fin[v];
                v++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                System.out.print(ss[i][j]+" |");
            } System.out.println();
        }for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
        if(ss[i][j].equals(search)){
            a[0]=i;
            a[1]=j;
        }}}
        System.out.println(Arrays.toString(a));
    }

   
    
}
