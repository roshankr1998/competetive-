package basics.arraylist;

import java.util.Arrays;

public class abc {
    public static void main(String[] args) {
        int n=3;
        int a[]={6,4,1};
        int res=4;
        int minus=1;
        int count=0;
       
       // System.out.println(max);

        count =minProject(a,res,minus);


        
        System.out.println(count);

   
    }

    private static int minProject(int[] errorScore, int comP, int othQ) {
        int answer =0;
        int n=errorScore.length;
        int max=getmax(errorScore);
        while(errorScore[max]!=0){
            for(int i=0;i<n;i++){
                if(i==max){
                    errorScore[i]=((errorScore[i]-comP)>0)?errorScore[i]-comP:0;
                }else{
                    errorScore[i]=((errorScore[i]-othQ)>0)?errorScore[i]-othQ:0;
                }
            }
            answer++;
            max=getmax(errorScore);
        }
     return answer;
    }

    private static int getmax(int[] a) {
            int res=Integer.MIN_VALUE;
            int x=0;
            for(int i=0;i<a.length;i++){
                if(a[i]>res){
                    res=a[i];
                    x=i;
                }
            }
            return x;
    }
    
}