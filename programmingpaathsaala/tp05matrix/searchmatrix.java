package programmingpaathsaala.tp05matrix;
import java.util.*;
public class searchmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a[][]=new int [x][y];
        
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                a[i][j]=sc.nextInt();
}
}
int key =sc.nextInt();
boolean flag=false;
for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
    if(a[i][j]==key) flag=true;
    }}
    System.out.println((flag)?"true":"false");
    sc.close();
}}
