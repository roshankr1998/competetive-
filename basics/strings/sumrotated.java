package basics.strings;

import java.util.Scanner;

public class sumrotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int n=a.length();
        int i=n;
        int carry=0;
        int sum=0;
        while(i-->0){
            sum=0;
            for(int x=i;x<n+i;x++){
                sum=sum+a.charAt(x%n)-'0';
            }
            carry=carry*10+sum;
        }
        System.out.println(carry);
        
    }
   

    
}
