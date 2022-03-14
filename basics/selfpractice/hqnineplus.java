package basics.selfpractice;

import java.util.Scanner;

public class hqnineplus {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int flag=0;
    for(int i=0;i<s.length();i++){
       
        if(s.charAt(i)=='H'||s.charAt(i)=='Q'||s.charAt(i)=='9'){
            System.out.println("YES");
            flag=1;
            break;
        }
    }
    if(flag==0) System.out.println("NO");
}}
