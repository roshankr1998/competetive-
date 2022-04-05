package basics.recursion;

import java.util.ArrayList;
import java.util.List;

public class phonekeypad {
    public static void main(String[] args) {
        String a="23";
        String dig[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<Character> l=new ArrayList<>(); 
        
        List<String> res=new ArrayList<>();
        if(a.length()==0){ System.out.println(res);
            }else{
                find(a,dig,l,0,res);
                System.out.println(res);
            }

    }


    private static void find(String a, String[] dig, List<Character> l, int ind, List<String> res) {
        if(ind==a.length()){
            String s="";
            for(int i=0;i<l.size();i++){
                s=s+l.get(i);
            }
            res.add(s);
            return;
        }
        int number=a.charAt(ind)-'0';
        String val=dig[number];

        for(int i=0;i<val.length();i++){
            l.add(val.charAt(i));
            find(a, dig, l, ind+1, res);
            l.remove(l.size()-1);
        }
    }
}
