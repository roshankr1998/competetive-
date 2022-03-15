package basics.arraylist;

public class matrixprefsum {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]=new int[3][3];
        for(int i=0;i<3;i++){
            b[i][0]=a[i][0];
        }
       
        for(int i=0;i<3;i++){
            for(int j=1;j<3;j++){
                b[i][j]=b[i][j-1]+a[i][j];
            }
        }

        for(int i=1;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=b[i-1][j]+b[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

    }
    
    
}
