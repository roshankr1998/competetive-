package basics.arraylist;

/**
 * string
 */
public class string {

    public static void main(String[] args) {
        String s="abcab";
int count=0;
        for(int i=0;i<s.length();i++){
            String ss="";
            for(int j=i;j<s.length();j++){
                ss=ss+s.charAt(j);
                if(check(ss)){
                    System.out.println(ss);
                    count++;
                }
            }
        }
        System.out.println( count);
    }

    private static boolean check(String ss) {
        if(ss.charAt(0)==ss.charAt(ss.length()-1)) return true;
        return false;
    }
}