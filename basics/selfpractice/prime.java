package basics.selfpractice;

public class prime {
    public static void main(String[] args) {
        int n=16    ;
        int i=2;
        while(i<=n){
           // x=n;
            if(n%i==0)
            System.out.println(i);
            while(n%i==0){
                n=n/i;
            }
            i++;
        }
    }
    
}
