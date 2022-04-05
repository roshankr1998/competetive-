package programmingpaathsaala.tp06strings;

import java.util.Scanner;

public class rounddecimals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int res=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
                res=res*10+(s.charAt(i)-'0');
            }else{
                if((s.charAt(i+1)-'0')<5){
                    System.out.println(res);
                    break;
                }else{
                    System.out.println(res+1);
                    break;
                }
            }
        }
        sc.close();
    }
    
}
