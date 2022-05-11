package basics.arraylist;

public class largesthisto {
    public static void main(String[] args) {
        int a[]={2,1,5,6,2,3};
        int res=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int area=Math.min(a[i],a[j])*(j-i);
                res=Math.max(res, area);
            }
        }
        System.out.println(res);
    }
    
}
