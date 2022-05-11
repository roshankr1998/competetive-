package programmingpaathsaala.tp11arraylistanddynamicarrays.ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalstriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> ll=new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(j==1 ||j==i){
                ll.add(1);
                }else{
                    ll.add(l.get(i-2).get(j-2)+l.get(i-2).get(j-1));
                }
            }
            l.add(ll);
        }
        System.out.println(l);
        sc.close();
    }
    
}
