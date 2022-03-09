package basics.arrays;

public class insertion {
    public static void main(String[] args) {
        int a[]={5,1,6,0,4,2};
        for(int i=1;i<a.length;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }}
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");}} 
}
