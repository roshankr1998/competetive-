package programmingpaathsaala.tp05matrix;
import java.util.*;
public class matrixprod {
    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc=new Scanner (System.in);
	int row1=sc.nextInt();
	int col1= sc.nextInt();
	int a[][]=new int [row1][col1];
	for(int i=0;i<row1;i++){
	    for(int j=0;j<col1;j++){
		a[i][j]=sc.nextInt();
	    }
	}
	int row2=sc.nextInt();
	int col2= sc.nextInt();
	int b[][]=new int [row2][col2];
	for(int i=0;i<row2;i++){
	    for(int j=0;j<col2;j++){
		b[i][j]=sc.nextInt();
	    }
	}
	if(row2==col1 ){
	    int c[][]=new int [row1][col2];
	    for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
            for(int x=0;x<row2;x++){
                c[i][j]+=a[i][x]*b[x][j];
            }
        }
    }
    for(int i=0;i<c.length;i++){
        for(int j=0;j<c[0].length;j++){
            System.out.print(c[i][j]+" ");
        }}
	}
	else{
	    System.out.println("IMPOSSIBLE");
	}
	sc.close();
    }
}