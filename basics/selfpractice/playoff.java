package basics.selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class playoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=n;
            n=(int)Math.pow(2, n);
            int a[]=new int[n];
            ArrayList <Integer> l=new ArrayList<>();
            for(int i=1;i<=n;i++){
                l.add(i);
            }int z=1;
           // System.out.println(l);
            while(z<=x){
                ArrayList <Integer> fin=new ArrayList<>();
                for(int i=1;i<l.size();i=i+2){
                    if((l.get(i)+l.get(i-1))%2==1)
                    fin.add(l.get(i-1));

                    else if((l.get(i)+l.get(i-1))%2==0)
                    fin.add(l.get(i));
                }
                //System.out.println(fin);
                l=new ArrayList<>(fin);
                z++;
            }
            System.out.println(l.get(0));
            
        }
    }
    
}
