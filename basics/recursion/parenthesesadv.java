package basics.recursion;
import java.util.*;
public class parenthesesadv {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        List<String> l=new ArrayList<>();
        generate("",n,n,x,x,l);
        System.out.println(l);
        sc.close();
    }

    private static void generate(String string, int open, int close, int open1, int close1, List<String> l) {



        if(open==0 && close==0  && open1==0 && close1==0){

            l.add(string);

            return;

        }

        if(open!=0){

            generate(string+'(', open-1, close, open1, close1, l);

        }
        if(open1!=0){

            generate(string+'{', open, close, open1-1, close1, l);

        }

        if(open<close){
            if(string.charAt(string.length()-1)!='{' && open1==close1){
                generate(string+'}', open, close-1, open1, close1, l);
            }
        }
        if(open1<close1){
            if(string.charAt(string.length()-1)!='(' && open==close){
                generate(string+')', open, close, open1, close1-1, l);
            }
        }

        

    }

    

}

