package programmingpaathsaala.tp06strings;

import java.util.Scanner;

public class sum4digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int n=s.length();
        if(n==4){
            System.out.println(s);
        }else{
            for(int i=0;i<4-n;i++){
                s='0'+s;
            }
            System.out.println(s);
        }
        sc.close();
    }
    
}
