package basics.selfpractice;

public class moveelementsback {
    public static void main(String[] args) {
        int a[]={-12,11,-13,-5,6,-7,5,-3,-6};

        int x=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                int t=a[i];
                a[i]=a[x];
                a[x]=t;
                x++;
            }
        }
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");}
    }
}
