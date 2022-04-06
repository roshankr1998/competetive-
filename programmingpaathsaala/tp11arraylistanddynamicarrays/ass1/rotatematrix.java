package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

public class rotatematrix {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        


        int b[][]=new int [a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                b[i][j]=a[a.length-j-1][i];
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
        System.out.println();}
    }
    
}
