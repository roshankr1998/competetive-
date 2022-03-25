package basics.selfpractice;

/**
 * uppercase
 */
public class uppercase {

    public static void main(String[] args) {
        String  c="roshan";
        System.out.println(c);
        String fin="";
        for(int i=0;i<c.length();i++){
            int x=c.charAt(i)-'a'+'A';
            fin=fin+(char)x;
        }
        
        
        System.out.println(fin);
    }
}