package programmingpaathsaala.tp05matrix;
import java.util.*;
public class matrixprod {
    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int m= sc.nextInt();
	int a[][]=new int [n][m];
	for(int i=0;i<n;i++){
	    for(int j=0;j<m;j++){
		a[i][j]=sc.nextInt();
	    }
	}
	int n2=sc.nextInt();
	int m2= sc.nextInt();
	int b[][]=new int [n2][m2];
	for(int i=0;i<n2;i++){
	    for(int j=0;j<m2;j++){
		b[i][j]=sc.nextInt();
	    }
	}
	if(m==n2 ){
	    int c[][]=new int [m][m];
	    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            for(int x=0;x<n;x++){
                c[i][j]+=a[i][x]*b[x][i];
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(c[i][j]+" ");
        }}
	}
	else{
	    System.out.println("IMPOSSIBLE");

	}
	sc.close();
    }
}