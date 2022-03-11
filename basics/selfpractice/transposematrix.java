package basics.selfpractice;

//import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       // int b[][]=new int[4][4];

       //transpose matrix 
      /* for(int i=0;i<4;i++){
            for(int j=i;j<4;j++){
                int x=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=x;
                
            }}*/

            // print matrix
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.print(a[i][j]+" ");}System.out.println();

        }
        System.out.println();
        System.out.println();
        //print upper half
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");}System.out.println();

    } System.out.println();
    System.out.println();

    // print lower half
    for(int i=0;i<a.length;i++){
        for(int j=0;j<=i;j++){
            System.out.print(a[i][j]+" ");}System.out.println();

}
System.out.println();
System.out.println();

//diagonals
//left
for(int i=0;i<a.length;i++){
    for(int j=0;j<a[0].length;j++){
        if(i==j) System.out.print(a[i][j]+" ");

}
}
System.out.println();
//right
for(int i=0;i<a.length;i++){
    for(int j=0;j<a[0].length;j++){
        if((i+j)==a.length-1)System.out.print(a[i][j]+" ");}

}}
    
}
