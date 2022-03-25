package basics.arraylist;

public class rearrangearray {
    public static void main(String[] args) {
        int a[]={1,3,0,2};
        int temp[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            temp[a[i]]=i;
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : temp) {
            System.out.println(i);
        }
    }
    
}
