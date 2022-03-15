package basics.arraylist;
//import java.util.*;
public class submatricessum {
  public static void main(String[] args) {
    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    long sum=0;
    int n=3; int m=a[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            sum+=(i+1)*(j+1)*a[i][j]*(n-i)*(m-j);
        }
    }
    System.out.println(sum);
  }  
    
    
}
