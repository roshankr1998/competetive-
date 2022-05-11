package basics.arraylist;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static List<List<Integer>> l =new ArrayList<>();
    public static void main(String[] args) {
        int a[]={1,2,3};
        
        //power(a,0,a.length,"",l);
        List<Integer> fin=new ArrayList<>();
        //power1(a,0,a.length,fin);

        printsubs(4,1,2,0,fin);
        System.out.println(l);
    }

    private static void printsubs(int n, int index, int length, int tot, List<Integer> fin) {
        if(tot==length){
            l.add(new ArrayList<>(fin));
            return;
        }
        if(index>n ||tot-length>n-index) return;
        
            fin.add(index);
            printsubs(n,index+1, length, tot+1, fin);
            fin.remove(fin.size()-1);
            printsubs(n,index+1, length, tot, fin);
        }
    

    private static void power1(int[] a, int i, int length, List<Integer> fin) {
        if(i==length){
            System.out.println(fin);
            l.add(fin);
            return;
        }

        fin.add(a[i]);
        power1(a, i+1, length, fin);
        fin.remove(fin.size()-1);
        power1(a, i+1, length, fin);
        
    }






    private static void power(int[] a, int i, int length, String string, List<List<Character>> l) {

        if(i==length){
            List<Character> res=new ArrayList<>();
            for(int x=0;x<string.length();x++){
                res.add(string.charAt(x));
            }
            l.add(res);
            string="";
            return;
        }
        power(a, i+1, length, string+a[i], l);
        power(a, i+1, length, string, l);
        
    }
    
}
