package basics.recursion;

public class palin {
    public static void main(String[] args) {
        String s="mom";
        boolean a=palind(s,0,s.length()-1);
        System.out.println(a);
        
    }

    private static boolean palind(String s, int i, int j) {
        if(i>j) return true;
        if(s.charAt(i)!= s.charAt(j)) return false;
        else return palind(s, i+1, j-1);
    }
}
