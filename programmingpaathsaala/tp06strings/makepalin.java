package programmingpaathsaala.tp06strings;

import java.util.Scanner;

public class makepalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
    int st=0;int n=s.length()-1;
    int count=0;
    while(st<n){
        if(s.charAt(st)!=s.charAt(n)){
            count++;
        }
        st++;
        n--;
    }
    System.out.println(count);
    sc.close();
    }
    
}
