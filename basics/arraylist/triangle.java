package basics.arraylist;

import java.util.regex.Pattern;

public class triangle {
    public static void main(String[] args) {
        int n=4;
        pattern(n);
    }

    private static void pattern(int n) {
        int print=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(print+" ");
            }
            System.out.println();
        }
    }
    
}
