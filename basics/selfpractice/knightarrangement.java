package basics.selfpractice;

import java.util.*;
import java.util.List;

public class knightarrangement {
    public static void main(String[] args) {
        char a[]={'D','A','A','K','A','D','K','A','K','K'};
        int s=0;
        char b[]=new char[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]=='A'){
                b[s]='A';
                s++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!='A'){
                b[s]=a[i];
                s++;
            }
        }
        for (char c : b) {
            System.out.print(c+" ");
        }
        
    }
}
