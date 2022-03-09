package basics.arrays;

public class selectionsort {
    public static void main(String[] args) {
        int a[]={5,1,6,0,4,2};
        for(int i=0;i<a.length;i++){
            int min=Integer.MAX_VALUE;
            int minind=0;
            for(int j=i;j<a.length;j++){
                if(a[j]<=min){
                    min=a[j];
                    minind=j;
                }
                int temp=a[i];
                a[i]=a[minind];
                a[minind]=temp;

            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
