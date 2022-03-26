package basics.recursion;

public class saydigits {
    public static String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
        
        int n=5223;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }

       // String s=say(rev,"");
       //System.out.println(s);
       count(n);
    }
    private static void count(int n) {
        if(n==0) return;
        System.out.print(a[n%10]);
        count(n/10);
       
    }
    /*private static String say(int n, String s) {
        if(n==0) return s;
        s=s+a[n%10]+" ";
        
        
        return say(n/10,s);
        
    }*/
    
}
