package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.Scanner;

public class maxvowels {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s=sc.next();
    int k=sc.nextInt();

    int count=0;
    int max=0;
    for(int i=0;i<k;i++){
        char a =s.charAt(i);
        if(a=='a'||a=='e'|| a=='i'||a=='o'||a=='u'){
            count++;
        }
    }
    max=Math.max(max, count);
    for(int i=k;i<s.length();i++){
        char a =s.charAt(i);
        if(a=='a'||a=='e'|| a=='i'||a=='o'||a=='u'){
            count++;


    }
    char rem=s.charAt(i-k);
    if(rem=='a'||rem=='e'|| rem=='i'||rem=='o'||rem=='u'){
        count--;

    }
    max=Math.max(count, max);
    
}
System.out.println(max);
sc.close();}}
